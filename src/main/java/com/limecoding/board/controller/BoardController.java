package com.limecoding.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.limecoding.board.dto.BoardDTO;
import com.limecoding.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	private BoardService boardService;
	
	@Autowired
	public BoardController(BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	// �Խñ� �ۼ� ������
	@GetMapping("/save")
	public String saveForm() {
		return "save";
	}
	
	// �Խñ� ��� ��ȸ
	@GetMapping("/")
	public String findAll(Model model) {
		List<BoardDTO> boardDTOList = boardService.findAll();
		model.addAttribute("boardList", boardDTOList);
		
		System.out.println(boardDTOList.get(0));
		
		return "list";
	}
	
	// �Խñ� �� ��ȸ
	@GetMapping("/detail")
	public String findById(@RequestParam("id") Long id, Model model) {
		BoardDTO boardDTO = boardService.findById(id);
		model.addAttribute("board", boardDTO);
		return "detail";
	}
	
	// �Խñ� ����
	@PostMapping("/save")
	public String save(@ModelAttribute BoardDTO boardDTO) {
		int saveResult = boardService.save(boardDTO);
		if(saveResult > 0) {
			return "redirect:/board/";
		} else {
			return "redirect:/board/detail?id=" + boardDTO.getId();
		}
	}
	
	// �Խñ� ���� ������
	@GetMapping("/update")
	public String updateForm(@RequestParam("id") Long id, Model model) {
		BoardDTO boardDTO = boardService.findById(id);
		model.addAttribute("board", boardDTO);
		return "update";
	}
	
	
	// �Խñ� ����
	@PostMapping("/update")
	public String update(@ModelAttribute BoardDTO boardDTO, Model model) {
		boardService.update(boardDTO);
		model.addAttribute("board", boardDTO);
		System.out.println(boardDTO);
		return "redirect:/board/detail?id=" + boardDTO.getId();
	}
	
	// �Խñ� ����
	@GetMapping("/delete")
	public String delete(@RequestParam("id") Long id) {
		boardService.delete(id);
		return "redirect:/board/";
	}
}