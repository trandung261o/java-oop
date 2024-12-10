package example_3;

public class Circle extends Shape {
	private double radius;
	Circle (String n, double r) {
		super(n);
		radius = r;
	}
	
	/*lớp con bắt buộc phải override tất cả 
	 * các phương thức của lớp cha
	 */
	public double calculateArea() {
		double area = (double) (3.14 * radius * radius);
		return area;
	}
}
