package com.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.board.domain.BoardVO;

@Service
public interface BoardService {
	
	public List<BoardVO> list() throws Exception;
	
}
