// File: W07_P3.java
import java.util.Scanner;

public class task77 {

    // Function to compute the sum of all prime numbers in a given range
    public static int primeSum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Helper function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int j = 3; j <= Math.sqrt(num); j += 2) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        System.out.println(primeSum(x, y));
    }
}
