package example_1;

public class Test3 {
	static String teamInfo(Person p1, Person p2) {
		return "Leader :" + p1.getName() + ", member; " + p2.getName();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(), e2 = new Employee();
		Manager m1 = new Manager(), m2 = new Manager();
		//..
		System.out.println(teamInfo(e1, e2));
		System.out.println(teamInfo(m1, m1));
		System.out.println(teamInfo(m1, e2)); //Upcasting
	}

}
