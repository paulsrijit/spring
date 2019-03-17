package spring.practice.javabrains.videotutorial7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {//Tutorial 7

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-videotutorial7.xml");
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.draw();
	}

}
