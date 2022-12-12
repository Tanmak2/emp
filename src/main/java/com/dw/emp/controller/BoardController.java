package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BoardController {
	
	@GetMapping("/board")
	public String callBoardPage() {
		return "board";
	}
	
	@GetMapping("/write")
	public String callWritePage() {
		return "write";
	}
	
	@GetMapping("/board/{board_no}")
	public String callDetilBoardpage(@PathVariable int board_no, ModelMap map) {
		map.addAttribute("board_no", board_no);
		return "update";
	}
}