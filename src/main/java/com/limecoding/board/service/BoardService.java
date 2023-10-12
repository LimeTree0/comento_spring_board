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



	// �Խñ� ����
	public int save(BoardDTO boardDTO) {
		return boardDAO.save(boardDTO);
	}
	
	// �Խñ� ��� ��ȸ
	public List<BoardDTO> findAll() {
		List<BoardDTO> boardDTOList = boardDAO.findAll();
		System.out.println("service: " + boardDTOList.get(0));
		return boardDTOList;  			
	}
	
	// �Խñ� 1�� ��ȸ
	public BoardDTO findById(Long id) {
		BoardDTO boardDTO = boardDAO.findById(id);
		return boardDTO;
	}
	
	// �Խñ� ����
	public void update(BoardDTO boardDTO) {
		boardDAO.update(boardDTO);
		System.out.println("service: " + boardDTO);
	}
	
	// �Խñ� ����
	public void delete(Long id) {
		boardDAO.delete(id);
	}

}