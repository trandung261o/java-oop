import java.util.Scanner;
import example.Student;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		int N = scanner.nextInt();
		scanner.nextLine();
		Student[] cls = new Student[N];
		for (int i = 0; i < N; i++) {
			System.out.println("Nhap sinh vien thu " + (i+1));
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Year: ");
			int year = scanner.nextInt();
			scanner.nextLine();
			cls[i] = new Student(year, name);
		}
		scanner.close();
		
		int total = 0;
		System.out.println("Danh sach lop: ");
		for (int i = 0; i < N; i++) {
			total += Calendar.getInstance().get(Calendar.YEAR) - cls[i].getYear();
			System.out.println(cls[i].getName());
		}
		System.out.println(total);
	}

}
