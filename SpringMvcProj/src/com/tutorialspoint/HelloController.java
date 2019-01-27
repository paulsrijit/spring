package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HelloController {

	@RequestMapping(value = "/hello.mvc", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		System.out.println("Inside printHello...");
		model.addAttribute("message", "Hello Srijit from Spring MVC framework!");
		System.out.println("Returning hello...");
		return "hello";
	}
}
