package com.sangbong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangbong.models.Board;
import com.sangbong.repositories.BoardRepository;

@RestController
public class BoardController {

	@Autowired
	BoardRepository boardRepository;
	
	@GetMapping
	List<Board> getBoardByTitle(){
		return boardRepository.findByTitle("내용..177");
	}
	
}
