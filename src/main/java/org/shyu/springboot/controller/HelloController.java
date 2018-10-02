package org.shyu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String hello() {
		return "Hello World!!";
	}
}
