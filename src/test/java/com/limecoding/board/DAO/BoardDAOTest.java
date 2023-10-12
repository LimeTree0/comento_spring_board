package com.limecoding.board.DAO;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.limecoding.board.dto.BoardDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardDAOTest {

	@Autowired
	private BoardDAO boardDAO;
	
	
	@Test
	public void saveTest() {
		// given
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setAuthor("author");
		boardDTO.setTitle("title");
		boardDTO.setContent("content");
		
		//when
		int id = boardDAO.save(boardDTO);
		
		//then
		BoardDTO findBoard = boardDAO.findById(Long.valueOf(id));
		assertEquals(findBoard.getTitle(), boardDTO.getTitle());
		
	}

}
