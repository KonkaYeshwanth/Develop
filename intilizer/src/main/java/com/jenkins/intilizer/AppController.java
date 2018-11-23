package com.jenkins.intilizer;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/rest")
public class AppController {
	
	@GetMapping(value="/")
	public String getValue() {
		return "I am String";
	}
	
	public ResponseEntity<List<String>> list(){
		List<String> names=Arrays.asList("yesh","sai","chow");
		return new ResponseEntity<List<String>>(names,HttpStatus.OK);
		
	}

}
