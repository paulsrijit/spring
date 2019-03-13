package spring.practice.javabrains.videotutorial6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-videotutorial6.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
	}

}
