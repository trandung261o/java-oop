package hust.soict.hedspi.lab01;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Users nhap mang thu cong? (yes/no)");
        String choice = scanner.nextLine();

        int[] array;

        if (choice.equalsIgnoreCase("yes")) {
            
            System.out.println("Nhap so luong phan tu trong mang:");
            int size = scanner.nextInt();
            array = new int[size];

            System.out.println("Nhap " + size + " gia tri cac phan tu:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
        } else {
            // Mang co dinh
            array = new int[]{1789, 2035, 1899, 1456, 2013};  
        }

        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

        int sum = 0;
        for (int i = 0; i < n; i++) 
            sum += array[i];

        double average = (double) sum / n;

        System.out.println("Mang sau sap xep: " + Arrays.toString(array));
        System.out.println("Sum: " + sum);
        System.out.println("Average value: " + average);

        scanner.close();
    }
}
