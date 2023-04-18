package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.Book;

@RestController
public class BookRestController {
@PostMapping(value="/book", consumes= {"application/xml","application/json"})
	public ResponseEntity<String> addBook(@RequestBody Book book){
		System.out.println(book);
		String msg="Book saved Successfully";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
}
