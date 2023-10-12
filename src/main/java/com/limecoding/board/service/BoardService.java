package com.limecoding.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limecoding.board.dto.BoardDTO;
import com.limecoding.board.DAO.BoardDAO;

@Service
public class BoardService {

	private final BoardDAO boardDAO;
	
	@Autowired
	public BoardService(BoardDAO boardDAO) {
		super();
		this.boardDAO = boardDAO;
	}



	// 게시글 저장
	public int save(BoardDTO boardDTO) {
		return boardDAO.save(boardDTO);
	}
	
	// 게시글 모두 조회
	public List<BoardDTO> findAll() {
		List<BoardDTO> boardDTOList = boardDAO.findAll();
		System.out.println("service: " + boardDTOList.get(0));
		return boardDTOList;  			
	}
	
	// 게시글 1개 조회
	public BoardDTO findById(Long id) {
		BoardDTO boardDTO = boardDAO.findById(id);
		return boardDTO;
	}
	
	// 게시글 수정
	public void update(BoardDTO boardDTO) {
		boardDAO.update(boardDTO);
		System.out.println("service: " + boardDTO);
	}
	
	// 게시글 삭제
	public void delete(Long id) {
		boardDAO.delete(id);
	}

}