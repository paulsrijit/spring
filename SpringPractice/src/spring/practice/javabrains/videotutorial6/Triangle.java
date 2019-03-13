package spring.practice.javabrains.videotutorial6;

public class Triangle {
	
	private String type;
	private Short area;

	public Triangle(String type, Short area) {
		super();
		System.out.println("Triangle constructor called.");
		this.type = type;
		this.area = area;
	}

	public void draw() {
		System.out.println(type + " type triangle drawn with area " + area + ".");
	}
}
