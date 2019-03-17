package spring.practice.javabrains.videotutorial10;

public class Circle {
	private Point centre;
	private Area area;
	
	public Circle(Point centre, Area area) {
		super();
		this.centre = centre;
		this.area = area;
	}

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public void draw() {
		System.out.println("Circle drawn: ");
		System.out.println("Centre: " + getCentre().getX() + ", " + getCentre().getY());
		System.out.println("Area: " + getArea());
	}
}
