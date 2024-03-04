package com.example.librarymanagementassgn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller


public class indexcontroller {

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/addbook")
	public String addingbook() {
		return "addbook";
	}
	
}
