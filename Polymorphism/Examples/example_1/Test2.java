package example_1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager junior = new Manager();
		Manager senior = new Manager();
		//...
		senior.setAssistant(junior); //Upcasting junior
		
		Employee e = new Employee();
		Person p = 	e; //Upcasting
		Employee ee = (Employee)p; //Downcasting
		Manager m = (Manager) ee; //run-time error
		
		Person p2 = new Manager();
		Employee e2 = (Employee) p2;
		
		Person p3 = new Employee();
		Manager e3 = (Manager) p3;
	}

}
