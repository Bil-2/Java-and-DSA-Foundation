import java.util.Scanner;

public class task57 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        // Read any two values for a and b
        a = input.nextInt();
        b = input.nextInt();

        try {
            int result = a / b;  // division operation
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero.");
        }
    }
}
