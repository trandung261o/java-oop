class Test {
	public static void main(String args[]) {
		int i = 2;
		int day = 0;
		
		switch (i) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		}
		
		switch (day) {
		case 0:
		case 1:
			// rule = "weekend";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			// rule = "weekday";
			break;
		default: 
			//rule = "error";
		}
		
		if (day == 0 || day == 1) {
			//rule = "weekend";
		} else if (day > 1 && day < 7) {
			//rule = "weekday";
		} else {
			// rule = "error";
		}
	}
}
