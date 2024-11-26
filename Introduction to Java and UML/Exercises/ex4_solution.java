import java.util.Scanner;
public class ex4_solution {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int h = 0;
		 do {
			 System.out.print("Nhap h: ");
			 h = scanner.nextInt();
			 if (h > 10 || h < 2) 
				 System.out.println("gia tri h khong hop le (2<=h<=10)");
		 } while (h > 10 || h < 2);
		 
		 for (int i = 0; i < h; i++) {
			 for (int k = 0; k < h - i - 1; k++)
				 System.out.print(" ");
			 for (int j = 0; j < 2*i + 1; j++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
 	}
}