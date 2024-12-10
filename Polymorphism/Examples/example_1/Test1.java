package example_1;

public class Test1 {
	public static void main(String args[]) {
		Employee e = new Employee();
		Person p;
		p = e; //Upcasting
		p.setName("Hoa");
		//p.setSalary(350000); error do setSalary() không nằm trong lớp Person
	}
}
