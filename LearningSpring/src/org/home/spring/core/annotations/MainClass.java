package org.home.spring.core.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Student s1 = (Student) ctx.getBean("student"); //
//		System.out.println(s1.getStudentName());
		
//		Student s2 = (Student) ctx.getBean("my-student");
//		System.out.println(s2.getStudentName());
		
		School school = (School)ctx.getBean("school");
		System.out.println(school.toString());
	}

}
