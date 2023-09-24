package com.limecoding.board.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.limecoding.board.dto.BoardDTO;

@Repository
public class BoardRepository {

	private final SqlSessionTemplate sql;
	
	@Autowired
	public BoardRepository(SqlSessionTemplate sql) {
		super();
		this.sql = sql;
	}



	public int save(BoardDTO boardDTO) {
		
		return sql.insert("Board.save", boardDTO);
	}

}
