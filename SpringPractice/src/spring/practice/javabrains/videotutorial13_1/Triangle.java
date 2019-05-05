package spring.practice.javabrains.videotutorial13_1;

import java.util.List;

public class Triangle {

	public Triangle() {
		super();

		System.out.println("Triangle constructor called");

	}
	
	private List<Point> points;
	

	public List<Point> getPoints() {
		return points;
	}



	public void setPoints(List<Point> points) {
		this.points = points;
	}



	public void draw() {
		System.out.println("Traingle drawn:");
		System.out.println("Point A: " + getPoints().get(0).getX() + ", " + getPoints().get(0).getY());
		System.out.println("Point B: " + getPoints().get(1).getX() + ", " + getPoints().get(1).getY());
		System.out.println("Point C: " + getPoints().get(2).getX() + ", " + getPoints().get(2).getY());
	}

}
