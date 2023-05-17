package com.spring.myweb.command;

import java.time.LocalDateTime;

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

}
