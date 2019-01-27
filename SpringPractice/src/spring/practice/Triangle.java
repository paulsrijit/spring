package spring.practice;

public class Triangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Triangle drawn");
		System.out.println(hashCode());
	}

}
