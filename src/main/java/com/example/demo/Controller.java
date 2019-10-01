package com.example.demo;

import java.security.Principal;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public String doGet(@AuthenticationPrincipal Principal principal) {
		
		return "Hello" + principal;
		
		
	}
	
}
