package com.spring.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.db.model.BoardVO;
import com.spring.db.repository.IBoardDAO;

@Service
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
		return dao.getArticle(bno);
	}

	@Override
	public void deleteArticle(int bno) {
		dao.deleteArticle(bno);
	}

	@Override
	public void updateArticle(BoardVO vo) {
		dao.updateArticle(vo);
	}

}
