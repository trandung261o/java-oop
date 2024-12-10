package example_2;

public class Person {
	protected String name;
	protected int age;
	
	public String getDetail() {
		String s = this.name + ", " + this.age;
		return s;
	}
}
