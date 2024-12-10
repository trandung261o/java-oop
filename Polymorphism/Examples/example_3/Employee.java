package example_3;

public class Employee extends Person {
	protected double salary;
	public boolean setSalary(double sal) {
		salary = sal;
		return true;
	}
	
	public String getDetails() {
		System.out.println("getDetail() from Employee class");
		String s = name + ", " + birthday + ", " + salary; 
		return s;
	}
}
