package com.wonoh.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> login(){
		
		HttpHeaders responseHeaders = new HttpHeaders();
		   responseHeaders.set("MyResponseHeader", "MyValue");
		return new ResponseEntity<String>("a",responseHeaders,HttpStatus.CREATED);
	}
}
