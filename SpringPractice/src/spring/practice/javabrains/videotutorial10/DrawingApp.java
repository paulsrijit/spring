package spring.practice.javabrains.videotutorial10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-videotutorial10.xml");
		/*
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
		*/

		Circle circle = (Circle) applicationContext.getBean("circle");
		circle.draw();
	}

}
