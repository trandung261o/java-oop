package example_3;

public class Manager extends Employee {
	Employee assistant;
	//..
	public void setAssistant(Employee e) {
		assistant = e;
	}
	//..
	
	public String getDetails() {
		System.out.println("getDetail() from Manager class");
		String s = name + ", " + birthday + ", " + salary + ", " + assistant; 
		return s;
	}
}
