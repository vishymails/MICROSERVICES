package com.ibm;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@Value("${application.message:HelloWorld}")
	private String message="Hello Message";
	
	@GetMapping("/")
	public String welcome(Map<String, Object> model)
	{
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}
}
