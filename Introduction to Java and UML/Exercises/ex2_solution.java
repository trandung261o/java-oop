import java.util.Random;

public class ex2_solution {
    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);
            
            // Trao đổi vị trí
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    
    public static void main(String args[]) {
        // Mảng cho trước
        int[] array = {1, 2, 3, 4, 5, 6};
        
        shuffleArray(array);
        
        System.out.println("Dãy số sau khi tráo đổi:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
