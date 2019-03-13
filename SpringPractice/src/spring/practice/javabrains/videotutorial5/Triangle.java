package spring.practice.javabrains.videotutorial5;

public class Triangle {
	
	private String type;
	
	public String getType() {
		System.out.println("Type = " + type + ". getType method called.");
		return type;
	}

	public void setType(String type) {
		System.out.println("Type = " + type + ". setType method called.");
		this.type = type;
	}

	public void draw() {
		System.out.println(getType() + " triangle drawn");
	}
}
