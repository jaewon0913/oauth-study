package com.ouath.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class controller {
	
	@GetMapping
	public String home() {
		return "home";
	}

}
