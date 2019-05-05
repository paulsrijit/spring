package spring.practice.javabrains.videotutorial15;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-videotutorial15.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
	}

}

