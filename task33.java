import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        if (num >= 10 && num <= 99) {
            int tens = num / 10;
            int ones = num % 10;

            if (tens == ones) {
                System.out.println(num + " is a palindrome.");
            } else {
                System.out.println(num + " is NOT a palindrome.");
            }
        } else {
            System.out.println("Invalid input! Please enter a two-digit number.");
        }

        sc.close();
    }
}
