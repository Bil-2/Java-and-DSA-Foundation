import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();               // Read how many numbers
        int[] arr = new int[n];             // Create array of size n

        // Read n numbers into array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max with first element
        int max = arr[0];

        // Loop to find maximum
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the maximum value
        System.out.println("Maximum is: " + max);

        sc.close();
    }
}
