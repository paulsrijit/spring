package spring.practice.javabrains.videotutorial15;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle {
	
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
}
