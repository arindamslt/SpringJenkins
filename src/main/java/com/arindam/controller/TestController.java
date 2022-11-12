package com.arindam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
public String getInfo()
{
	return "<h2> HELLO</h2>";
}
}
