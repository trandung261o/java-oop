package example_1;

public class Square extends Shape {
	private double side;
	
	Square(String n, double s) {
		super(n);
		this.side = s;
	}
	
	public double calculateArea() {
		double area = (double) side * side;
		return area;
	}
}
