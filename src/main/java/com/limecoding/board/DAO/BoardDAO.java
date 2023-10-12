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


	// �Խñ� ����
	public int save(BoardDTO boardDTO) {
		return sql.insert("Board.save", boardDTO);
	}
	
	// �Խñ� ��� ��ȸ
	public List<BoardDTO> findAll() {
		return sql.selectList("Board.findAll");
	}
	
	// �Խñ� 1�� ��ȸ
	public BoardDTO findById(Long id) {
		return sql.selectOne("Board.findById", id);
	}
	
	// �Խñ� ����
	public void update(BoardDTO boardDTO) {
		sql.update("Board.update", boardDTO);
	}
	
	//�Խñ� ����
	public void delete(Long id) {
		sql.delete("Board.delete", id);
	}
}