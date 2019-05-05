package spring.practice.javabrains.videotutorial12;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

	public Triangle() {
		super();

		System.out.println("Triangle constructor called");

	}

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext applicationContext = null;
	private String beanName = null;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;

		System.out.println("Point A is set");

	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;

		System.out.println("Point B is set");

	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;

		System.out.println("Point C is set");
		
	}

	public void draw() {
		System.out.println("Traingle drawn:");
		System.out.println("Point A: " + getPointA().getX() + ", " + getPointA().getY());
		System.out.println("Point B: " + getPointB().getX() + ", " + getPointB().getY());
		System.out.println("Point C: " + getPointC().getX() + ", " + getPointC().getY());
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("setBeanName called");
		this.beanName = beanName;
		System.out.println("Bean Name : " + beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext called");
		this.applicationContext = applicationContext;
	}
	
	public void getArea() {
		System.out.println("Get Area Called");
		int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println("beanDefinitionCount : "+beanDefinitionCount);
		System.out.println("beanDefinitionNames : "+Arrays.toString(beanDefinitionNames));
	}

}
