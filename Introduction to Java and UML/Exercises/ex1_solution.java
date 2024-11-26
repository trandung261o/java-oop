import java.util.Scanner;
public class ex1_solution {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter month: ");
		int month = keyboard.nextInt();
		System.out.println("Enter year: ");
		int year = keyboard.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println("31 days");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println("30 days");
			break;
		case 2:
			if ((year%4 == 0 && year%100 != 0) || year%400 == 0)
				System.out.println("29");
			else 
				System.out.println("28");
			break;
		default:
			System.out.println("Wrong input!");
		}
	}
}
