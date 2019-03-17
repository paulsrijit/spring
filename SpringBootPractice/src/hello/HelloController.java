package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(path = "/")
	public String index() {
		return "Greetings from SpringBoot!";
	}
}
