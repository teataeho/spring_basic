package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class SnsBoardVO {

	private int bno;
	private String writer, uploadPath, fileLoca, fileName, fileRealName, content;
	private LocalDateTime regDate;
	
}
