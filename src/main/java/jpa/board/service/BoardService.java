package jpa.board.service;

import org.springframework.data.domain.Page;

import jpa.board.model.Board;

public interface BoardService {
	//게시판 리스트 보기
	public Page<Board> findAll(Integer curPage);
}
