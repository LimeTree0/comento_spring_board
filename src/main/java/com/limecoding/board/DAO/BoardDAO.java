package com.limecoding.board.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.limecoding.board.dto.BoardDTO;

@Repository
public class BoardDAO{

	private final SqlSessionTemplate sql;
	
	@Autowired
	public BoardDAO(SqlSessionTemplate sql) {
		super();
		this.sql = sql;
	}


	// 게시글 저장
	public int save(BoardDTO boardDTO) {
		return sql.insert("Board.save", boardDTO);
	}
	
	// 게시글 모두 조회
	public List<BoardDTO> findAll() {
		return sql.selectList("Board.findAll");
	}
	
	// 게시글 1개 조회
	public BoardDTO findById(Long id) {
		return sql.selectOne("Board.findById", id);
	}
	
	// 게시글 수정
	public void update(BoardDTO boardDTO) {
		sql.update("Board.update", boardDTO);
	}
	
	//게시글 삭제
	public void delete(Long id) {
		sql.delete("Board.delete", id);
	}
}