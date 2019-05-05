package spring.practice.javabrains.videotutorial14;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{

	public Triangle() {
		super();

		System.out.println("Triangle constructor called");

	}

	private Point pointA;
	private Point pointB;
	private Point pointC;

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
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init called from Triangle");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy called from Triangle");
	}
}
