package example_1;

public class Employee extends Person {
	private double salary;
	public boolean setSalary(double sal) {
		salary = sal;
		return true;
	}
	
	public String getDetail() {
		String s = name + ", " + birthday + ", " + salary; 
		return s;
	}
}
