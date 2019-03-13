package spring.practice.javabrains.videotutorial6;

public class Triangle {
	
	private String type;

	public Triangle(String type) {
		super();
		System.out.println("Triangle constructor called.");
		this.type = type;
	}

	public void draw() {
		System.out.println(type + " triangle drawn.");
	}
}
