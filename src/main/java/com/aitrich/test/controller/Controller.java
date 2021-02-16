package com.aitrich.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.aitrich.test.service.TestService;

@RestController
public class Controller {
	
	@Autowired
	TestService testService;

}
