package example_1;

public class TestS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test biến static iStatic
		TestStatic obj1 = new TestStatic();
		
		obj1.iStatic = 10; obj1.iNonStatic = 11;
		System.out.println(obj1.iStatic + ", " + obj1.iNonStatic);
		
		TestStatic obj2 = new TestStatic();
		System.out.println(obj2.iStatic + ", " + obj2.iNonStatic);
		
		obj2.iStatic = 12;
		System.out.println(obj1.iStatic + ", " + obj1.iNonStatic);
	}

}
