package com.test.Git_Maven_Second;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

	@GetMapping("/hii")
	public ResponseEntity<Object> find() {
		return ResponseEntity.ok("Hello World");
	}
	
}
