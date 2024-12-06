package example_2;

public class Point {
	private double x;
	private double y;
	public Point() {};
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void printPoint() {
		System.out.println("X: " + x + ", Y: " + y);
	}
}