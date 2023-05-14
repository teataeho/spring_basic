package com.spring.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.db.model.BoardVO;
import com.spring.db.repository.IBoardDAO;

public class BoardService implements IBoardService {
	
	@Autowired
	private IBoardDAO dao;

	@Override
	public void insertArticle(BoardVO vo) {
		System.out.println("vo: " + vo);
		dao.insertArticle(vo);
	}

	@Override
	public List<BoardVO> getArticles() {		
		return dao.getArticles();
	}

	@Override
	public BoardVO getArticle(int bno) {
		
		return null;
	}

	@Override
	public void deleteArticle(int bno) {
		

	}

	@Override
	public void updateArticle(BoardVO vo) {
		

	}

}
