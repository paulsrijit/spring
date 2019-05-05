package spring.practice.javabrains.videotutorial13_1;

public class Point {
	
	public Point() {
		super();
		
		System.out.println("Point constructor called");
		
	}
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
