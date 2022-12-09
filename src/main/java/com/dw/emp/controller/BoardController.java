package com.dw.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}