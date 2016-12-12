package prototype;

public class Square extends Shape {
	public Square() {
		type = "Circle";
	}
	
	@Override
	void draw() {
	      System.out.println("Inside Square::draw() method.");
	}
}
