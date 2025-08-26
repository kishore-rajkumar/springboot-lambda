package com.kishore.springboot_lambda.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kishore.springboot_lambda.dtos.MessageDto;

@RestController
public class HelloController {
	
	@GetMapping("/hi")
	public ResponseEntity<MessageDto> hi(){
		return ResponseEntity.ok(new MessageDto("hi"));
	}
	
	@GetMapping("/hello")
	public ResponseEntity<MessageDto> hello(){
		return ResponseEntity.ok(new MessageDto("hello"));
	}

}
