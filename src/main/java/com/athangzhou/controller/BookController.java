package com.athangzhou.controller;

import static org.junit.Assert.fail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.athangzhou.dao.BookDao;
import com.athangzhou.service.BookService;

@Controller
public class BookController {
	
	@Autowired(required=false)
	
	private BookDao bookDao;
	
	private BookService bookService;

	public void print()
	{
		System.out.println(bookDao);
	}
}
