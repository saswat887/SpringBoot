package com.jspyders;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentRestController {
	@GetMapping("/hii")
	@ResponseBody
	public String msg()
	{
		return "Welcome to Spring Boot";
	}
	
}
