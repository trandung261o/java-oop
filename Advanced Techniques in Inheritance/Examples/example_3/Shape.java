package example_3;

public abstract class Shape {
	protected String name;
	Shape(String n) { name = n; }
	
	public String getName() { return name; }
	public abstract double calculateArea();
}
