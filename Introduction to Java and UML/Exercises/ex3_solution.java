import java.util.Arrays;
import java.util.Scanner;

public class ex3_solution {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua mang: ");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Nhap gia tri cac phan tu cho mang: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println("Mang sau khi sap xep: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
