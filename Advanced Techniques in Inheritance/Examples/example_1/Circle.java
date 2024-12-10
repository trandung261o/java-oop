package example_1;

public class Circle extends Shape {
	private double radius;
	
	Circle(String n, double r) {
		super(n);
		radius = r;
	}
	
	public double calculateArea() {
		double area = (double) (3.14 * radius * radius);
		return area;
	}
}
