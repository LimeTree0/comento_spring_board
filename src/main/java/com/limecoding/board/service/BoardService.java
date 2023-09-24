package com.limecoding.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.limecoding.board.dto.BoardDTO;
import com.limecoding.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
public class BoardService {

	private final BoardRepository boardRepository;
	
	@Autowired
	public BoardService(BoardRepository boardRepository) {
		super();
		this.boardRepository = boardRepository;
	}



	public int save(BoardDTO boardDTO) {
		
		return boardRepository.save(boardDTO);
	}

}
