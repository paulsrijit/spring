package spring.practice.javabrains.videotutorial11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-videotutorial11.xml");
		
		Triangle triangle = (Triangle) applicationContext.getBean("triangle");
		Triangle triangle2 = (Triangle) applicationContext.getBean("triangle");
		
		System.out.println(triangle.hashCode()+", "+triangle2.hashCode()+" hashcodes are not same");
		
		System.out.println(triangle.getPointA().hashCode());
		System.out.println(triangle2.getPointA().hashCode());
		
		//Triangle objects are prototype but Point A objects for triangle 1 and triangle 2 are singleton

		
		Point centrePoint = (Point) applicationContext.getBean("centre");
		Point centrePoint2 = (Point) applicationContext.getBean("centre");
		System.out.println(centrePoint.hashCode()+", "+centrePoint2.hashCode()+" hashcodes are same");
		
	}

}

