package example_3;

public class Test {
	public static void main(String args[]) {
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		
		Person pArr[] = { p, e, m };
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getDetails());
		}
	}
}
