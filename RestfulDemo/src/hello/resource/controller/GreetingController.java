package hello.resource.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.resource.representation.Greeting;

@RestController
public class GreetingController {
	
	private static final String TEMPLATE = "Hello %s!";
	private final AtomicInteger id = new AtomicInteger();
	
	@RequestMapping("/restful/greeting")
	public Greeting restMeth1(@RequestParam(value="name", defaultValue="World") String nm) {
		System.out.println("hello.resource.controller.GreetingController.restMeth1(String)::CALLED");
		return new Greeting(id.incrementAndGet(), String.format(TEMPLATE, nm));
	}
}
