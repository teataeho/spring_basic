package com.spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.basic.model.UserVO;

//�ڵ����� ������ �����̳ʿ� �ش� Ŭ������ ���� ����ϴ� �Ƴ����̼�
//���� ����� ���� HandlerMapping�� �� Ŭ������ ��ü�� �˻��� �� ���� ���̴�.
@Controller
@RequestMapping("/request") //��Ʈ�ѷ� ��ü�� ����� URI ����
public class RequestController {

	public RequestController() {
		System.out.println("RequestCon ����!");
	}
	
	@RequestMapping("/test")
	public String testCall() {
		System.out.println("/request/test ��û�� ����!");
		return "test";
	}
	
	/*
    ���� ����ڰ� /request/req ��û�� ���� ���� ��
    views���� �Ʒ��� request���� �ȿ� �����ϴ�
    req-ex01.jsp������ ������ �޼��带 ������ ������.
   */
	
	//@RequestMapping(value = "/request/basic01", method = RequestMethod.GET)
	@GetMapping("/basic01")
	public String req() {
		System.out.println("/request/basic01 ��û�� ����!: GET ���!");
		return "request/req-ex01";
	}
	
	//@RequestMapping(value = "/request/basic01", method = RequestMethod.POST)
	@PostMapping("/basic01")
	public String basic() {
		System.out.println("/request/basic01 ��û�� ����!: POST ���");
		return "request/req-ex01";
	}
	
	////////////////////////////////////////////////////////////////////////
	
	//��Ʈ�ѷ� ���� �޼��� Ÿ���� void�� �����ϸ�
	//��û�� ���� URL���� �� ���������� �����մϴ�.
	@GetMapping("/join")
	public void register() {
		System.out.println("/request/join: GET");
	}
	
	//��û URI �ּҰ� ������, ���� ��Ŀ� ���� ������ �ٸ��� �ϱ� ������
	//���� �ּҸ� ����ϴ� ���� �����մϴ�. (GET -> ȭ��ó��, POST -> �Է°� ó��)
	
	/*
	 # ���������� ��û�� �Բ� ���޵� �����͸� ó���ϴ� ���
	 
	 1. �������� jsp/servlet ����� �Ķ���� �б� ó�� ���.
	 - HttpServletRequest ��ü�� Ȱ�� (�츮�� jsp���� ����ϴ� ���)
	
	
	@PostMapping("/join")
	public void register(HttpServletRequest request) {
		System.out.println("/request/join: POST");
		
		System.out.println("ID: " + request.getParameter("userId"));
		System.out.println("PW: " + request.getParameter("userPw"));
		System.out.println("HOBBY: " + Arrays.toString(request.getParameterValues("hobby")));
	}
	 */
	
	/*
	 2. @RequestParam �Ƴ����̼��� �̿��� ��û �Ķ���� ó��.
	 @RequestParam("�Ķ���� ������") ���� �޾Ƽ� ó���� ����
	 �Ķ���� ������� ���� ���� �������� �����ϰ� �ۼ��ϸ� @RequestParam ���� ����.
	 
	@PostMapping("/join")
	public void register(String userId,
						 String userPw,
						 @RequestParam(value="hobby", required = false, defaultValue = "no hobby person") List<String> hobby) {
		
		System.out.println("ID: " + userId);
		System.out.println("PW: " + userPw);
		System.out.println("hobby: " + hobby);
	}
	*/
	
	
	/*
	 3. Ŀ�ǵ� ��ü�� Ȱ���� �Ķ���� ó��
	 - �Ķ���� �����Ϳ� �����Ǵ� VO Ŭ������ �ʿ��մϴ�.
	 */
	
	@PostMapping("/join")
	public void register(UserVO vo) {
		System.out.println(vo);
	}
	
	
}


























