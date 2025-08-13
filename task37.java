import java.util.Scanner;

public class task37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasDigit = false;

        // Check length
        if (password.length() >= 8) {
            // Check each character
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                }
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            if (hasUppercase && hasDigit) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password must contain at least one uppercase letter and one digit.");
            }
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }

        sc.close();
    }
}
