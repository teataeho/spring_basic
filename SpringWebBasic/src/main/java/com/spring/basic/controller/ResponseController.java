package com.spring.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.basic.model.UserVO;

@Controller
@RequestMapping("/response")
public class ResponseController {
	
	@GetMapping("/res-ex01")
	public void resEx01() {}
	
	/*
	 1. Model ��ü�� ����Ͽ� ������ ȭ�鿡 �����͸� �����ϱ�.
	 
	@GetMapping("/test")
	public void test(int age, Model model) {
		model.addAttribute("age", age);
		model.addAttribute("nick", "�۸���");
	}
	*/
	
	//2. @ModelAttribute�� ����� ȭ�鿡 ������ ���� ó��
	//@RequestParam + model.addAttributeó�� ����
	@GetMapping("/test")
	public void test(@ModelAttribute("age") int age, Model model) {
//		model.addAttribute("age", age); �� �ʿ� x
		model.addAttribute("nick", "�۸���");
	}
	
	@GetMapping("/test2")
	public void test2(@ModelAttribute("info") UserVO vo) {
		System.out.println("�޼��� ���� �ܼ� ���: " + vo);
	}
	
	//3. ModelAndView ��ü�� Ȱ���� ó��
	@GetMapping("/test3")
	public ModelAndView test3() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName", "��ö��");
		mv.addObject("userAge", 30);
		mv.setViewName("/response/test3");
		
		return mv;
	}
	
	//////////////////////////////////////////////////////////////////////
	
	//Redirect ó��.
	
	//�� ȭ���� �����ִ� �޼���
	@GetMapping("/login")
	public String login() {
		System.out.println("/login: GET ��û �߻�!");
		return "response/res-redirect-form";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("userId") String id,
						@RequestParam("userPw") String pw,
						@RequestParam("userPwChk") String pwChk,
						RedirectAttributes ra) {
		
		System.out.println("/login: POST ��û �߻�!");
		System.out.println("ID: " + id);
		System.out.println("PW: " + pw);
		System.out.println("CHK: " + pwChk);
		
		if(id.equals("")) {
			/*
			 redirect ��Ȳ���� model ��ü�� ����ϰ� �Ǹ�
			 model ������ �����Ͱ� �� ��û�� ���� �� �Ķ���� ������ �پ ���ɴϴ�.
			 �����Ͱ� url �ּ� �ڿ� ?�� �Բ� ����Ǿ� ���޵˴ϴ�.
			 model.addAttribute("msg", "���̵�� �ʼ����Դϴ�!");
			 */
			
			//redirect ��Ȳ���� ��ȸ������ �����͸� ������ �� ����ϴ� �޼���.
			//url �ڿ� �����Ͱ� ���� �ʽ��ϴ�. �� �� �̿��� �Ŀ��� �˾Ƽ� �Ҹ��մϴ�.
			ra.addFlashAttribute("msg", "���̵�� �ʼ����̿���!");
		}
		
		return "redirect:/response/login";
		
	}
	
	
	

}

















