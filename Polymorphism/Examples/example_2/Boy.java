package example_2;

public class Boy extends Human {
	public static void walk() {
		System.out.println("Boy walk");
	}
	
	public static void main(String args[]) {
		Human obj1 = new Boy();
		
		Human obj2 = new Human();
		
		Boy obj3 = new Boy();
		
		obj1.walk();
		obj2.walk();
		obj3.walk();
		
		obj1 = obj3;
		obj1.walk();
	}
}
