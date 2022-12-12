package com.dw.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.emp.service.BoardService;
import com.dw.emp.vo.BoardVO;

@RestController
public class BoardApiController {
	@Autowired
	BoardService boardService;
	
	@GetMapping("/api/v1/board")
	public List<BoardVO> callBoard(){
		return boardService.selectBoard();
	}
	
	@PostMapping("/api/v1/board")
	public int insertBoard(@RequestBody BoardVO vo) {
		return boardService.insertBoard(vo);
	}
	
	@GetMapping("/api/v1/board/{board_no}")
	public BoardVO selectBoardFindByBoardNo(@PathVariable int board_no) {
		return boardService.selectBoardFindByBoardNo(board_no);
	}
	
	@PatchMapping("/api/v1/board")
	public int updateBoard(@RequestBody BoardVO vo) {
		return boardService.updateBoard(vo);
	}
	
	@DeleteMapping("/api/v1/board/{board_no}")
	public int deleteBoard(@PathVariable int board_no) {
		return boardService.deleteBoard(board_no);
	}
}
