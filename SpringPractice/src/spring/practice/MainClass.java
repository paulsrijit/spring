package spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Triangle triangle = (Triangle)applicationContext.getBean("triangle");
		triangle.draw();
		
		Triangle triangle2 = (Triangle)applicationContext.getBean("triangle");
		triangle2.draw();
	}

}
