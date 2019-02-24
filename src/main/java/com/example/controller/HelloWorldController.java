package com.example.controller;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;

@EnableAutoConfiguration
@RestController
@Component
public class HelloWorldController {

	@Resource
	private Book book;

	@RequestMapping("/hello")
	public String index() {
		return "Hello World" + "   书名：" + book.getName() + "作者：  " + book.getAuthor() + "-------" + book.getDesc();
	}

}
