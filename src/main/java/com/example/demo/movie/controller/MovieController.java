package com.example.demo.movie.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.movie.model.Movie;

@RestController
@CrossOrigin(origins = "http://localhost:3000")

public class MovieController {

	@RequestMapping("/")
	public void movie() {
		System.out.println("HelloWorld");
	}
	
	@PostMapping("login")
	public String login(@RequestBody Movie movie) {
		System.out.println(movie.getLoginId() + movie.getLoginPw());
		return "login ตส";
	}

}
