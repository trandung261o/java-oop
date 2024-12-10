package example_1;

public class Triangle extends Shape {
	private double base, height;
	Triangle (String n, double b, double h) {
		super(n);
		base = b;
		height = h;
	}
	
	public double calculateArea() {
		double area = 0.5f * base * height;
		return area;
	}
}
