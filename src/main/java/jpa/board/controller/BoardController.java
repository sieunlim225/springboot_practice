package jpa.board.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jpa.board.model.Board;
import jpa.board.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	//---------------------------------------------
	// 루트요청(localhost:8080/board/)시 리스트 보기로 
	//---------------------------------------------
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {				
		return "/clientlist";
	}
		
	//---------------------------------------------
	// 게시판 리스트 보기
	//---------------------------------------------
	@RequestMapping(value="/list/{curPage}", method = RequestMethod.GET)
	public String findAll(Model model, Pageable pageable, @PathVariable Integer curPage) {		
		Page<Board> page = boardService.findAll(curPage);	
		model.addAttribute("page", page);
		return "list";
	}
	
	@RequestMapping("/rform")
	public String registerform(Model model) {
		return "/register";
	}
	
	@RequestMapping(value="/register")
	public String register() {
		
		
		return ("redirect:/clientlist");
	}
	
}
