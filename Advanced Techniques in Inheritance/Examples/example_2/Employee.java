package example_2;

public class Employee extends Person {
	double salary;
	
	public String getDetail() {
		String s = super.getDetail() + ", " + this.salary; //super: tham chiếu đến cha
		return s;
	}
}
