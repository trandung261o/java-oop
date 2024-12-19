package hust.soict.hedspi.lab01;
import java.util.Scanner;
public class NumberOfDays {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int m, y;
		 while (true) {
			 System.out.println("Nhap thang va nam: ");
			 m = scanner.nextInt();
			 y = scanner.nextInt();
			 if (y < 0) continue;
			 
			 if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
				 System.out.println("So ngay cua thang la: " + 31);
				 break;
			 }
			 else if (m == 2) {
				 if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
					 System.out.println("So ngay cua thang la: 29");
				 else System.out.println("So ngay cua thang la: 28");
				 
				 break;
			 }
			 else if (m==4 || m==6 || m==9 || m==11) {
				 System.out.println("So ngay cua thang la: 30");
				 break;
			 }
			 else continue;
		 }
	}	 
}
