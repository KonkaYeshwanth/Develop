package com.jenkins.intilizer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/rest")
public class AppController {
	
	@GetMapping(value="/")
	public String getValue() {
		return "I am String";
	}

}
