package com.service1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNameController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/firstName")
	public String getFirstName() {
		return "Hitesh";
	}
}
