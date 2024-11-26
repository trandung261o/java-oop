/* This is a simple Java program 
FileName: "HelloWorld.java" */

class HelloWorld {
	// Your program begin with a call to main().
	// Prints "Hello, World" to the terminal window.
	public static void main(String args[]) {
		System.out.println("Hello, World");
		
		//1.2 Variables
		int passengers;
		passengers = 0;
		int price = 0;
		int speed = 100;
		int stockPrice = 75;
		
		passengers = passengers + 5;
		passengers = passengers - 3;
		System.out.println(passengers);
		
		//1.2.1. Variable Scope
		boolean isLightGreen = true; //true or false
		
		if (isLightGreen) {
			//traffic light is green
			double carSpeed = 100; //in km/h
			System.out.println("Drive!");
			System.out.println("Speed is: " + carSpeed);
		}
		
		//1.3. Basic Data Types
		int maxInt = 2147483647; //khoi tao = 0
		long muchMore = 2147483647 * 10000000;
		
		double fraction = 99.275; //khoi tao = 0.0
		
		char answer = 'b';
		char three = '3';
		//default value = zero (/u0000)
		
		boolean fact = true;
		boolean condition = false;
		
		//1.3.1 chuyen doi kieu du lieu (casting)
		int a=0, b=0;
		short c=0;
		a = b + c;
		
		int d=0;
		short e=0;
		e = (short)d;
		
		double f=0;
		long g=0;
		f = g;
		// g = f; error
		
		long p = (long)12345.56; // p se nhan gia tri 12345
		
		//1.4. Operators
		//toan tu "/"
		int i = 10/3;
		float f0 = 10;
		float f1 = (float)10/3;
		float f2 = 10/3;
		float f3 = f0/3;
		
		System.out.println(i); //3
		System.out.println(f1); //3.33333
		System.out.println(f2); //3.0
		System.out.println(f3); //3.33333
		
		//1.4.1. thu tu uu tien
		double paid = 10;
		double change = 3.25;
		double tip = (paid - change) * 0.2;
		System.out.println("tip = " + tip);
		
		int i2 = 0;
		System.out.println(i2 = 5); //5
		System.out.println(i2 += 4); //9
		System.out.println(i2++); //9
		System.out.println(--i2); //9
		
		//1.5. cau truc dieu khien
		isLightGreen = false;
		boolean isLightYellow = false;
		
		if (isLightGreen) {
			//traffic light is green
			System.out.println("Drive!");
		} else if (isLightYellow) {
			//light is NOT green but is yellow
			System.out.println("Slow down.");
		} else {
			// light is neither green nor yellow
			System.out.println("Stop.");
		}
		//1.5.1 vong lap
		int numOfWarnings = 5;
		i = 1;
		while (i <= numOfWarnings) {
			System.out.println("Warning");
			i++;
		}
		
		System.out.println("");
		
		for (i = 1; i <= numOfWarnings; i++) {
			System.out.println("Warning");
		}
		
		//1.6. array
		//khai bao
		//kieu_dulieu[] ten_mang = new kieu_dulieu[size];
		//kieu_dulieu ten_mang[] = new kieu_dulieu[size];
		//dieu_dl ten_mang[] = {danh sach gia tri cac phan tu};
		System.out.println("");
		
		int MAX = 5;
		boolean bit[] = new boolean[MAX];
		float[] value = new float[2*3];
		int[] number = {10, 9, 8, 7, 6};
		System.out.println(bit[0]); //print "false"
		System.out.println(value[3]); //print 0.0
		System.out.println(number[1]); //print 9
		
		int size = number.length;
		System.out.println(size);
		
		//khai bao mang 2 chieu
		//kieu_dl[][] ten_mang;
	}
	
	//1.5.2 break va continue
	public int myMethod(int x) {
		int sum = 0;
		outer: for (int i = 0; i < x; i++) {
			inner: for (int j = i; j < x; j++) {
				sum++;
				if (j==1) continue;
				if (j==2) continue outer;
				if (j==3) break;
				if (j==4) break outer;
			}
		}
		return sum;
	}
	
	
	
}