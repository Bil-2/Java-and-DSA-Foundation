import java.util.Scanner;
import java.util.InputMismatchException;

public class task55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] name = new int[length];
        int sum = 0;

        try {
            // Read array elements
            for (int i = 0; i < length; i++) {
                name[i] = sc.nextInt();
                sum += name[i];
            }
            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("You entered bad data.");
        }
    }
}
