package spring.practice.javabrains.videotutorial12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-videotutorial12.xml");
		
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		triangle.getArea();
		
		Point centrePoint = (Point) applicationContext.getBean("centre");
		
		
	}

}

