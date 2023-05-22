package com.spring.myweb.command;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
	
	private String userId, userPw, userName, userPhone1, userPhone2
		, userEmail1, userEmail2, addrBasic, addrDetail, addrZipNum;
	private LocalDateTime regDate;
	
	/*
	 한 명의 회원은 글을 여러 개 작성할 수 있습니다.
	 마이페이지에서는 특정 회원이 작성한 글 목록을 나타내야 합니다.
	 회원 정보와 글 목록은 서로 다른 테이블로 이루어져 있고, 마이페이지 에서는
	 해당 정보를 한 번의 DB 연동으로 가져올 수 있도록 하기 위해
	 JOIN 문법으로 테이블을 합친 뒤 원하는 컬럼을 선택해서 가져올 예정입니다.
	 */
	
	//1이 UserVO 이기 때문에 UserVO 안에 N의 값을 뜻하는 FreeBoardVO 객체의 모음을
	//저장할 수 있는 리스트를 선언.
	//1:N관계의 테이블을 list 형태로 선언.
	private List<FreeBoardVO> userBoardList;

}
