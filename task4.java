import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int quotient = x / y;     // Integer division
        int remainder = x % y;    // Modulus

        System.out.println(quotient);
        System.out.println(remainder);

        sc.close();
    }
}
