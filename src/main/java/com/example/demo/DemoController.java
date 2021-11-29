package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(path = "/welcome")
	public String getWelcome() {
		return "Welcome! to Deployed Page using amazon ec2 service";
	}
}