// File: task79.java
import java.util.Scanner;

public class task79 {   // ✅ Class name matches file name
    private String password;

    // ✅ Constructor name matches class name
    public task79(String password) {
        this.password = password;
    }

    // Method to validate password
    public boolean isValidPassword() {
        // Rule 1: Minimum length 8
        if (password.length() < 8) {
            return false;
        }

        // Rule 2: At least one uppercase letter
        boolean hasUppercase = false;
        // Rule 3: At least one digit
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        return hasUppercase && hasDigit;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPassword = scanner.nextLine();
        scanner.close();

        task79 validator = new task79(inputPassword);  // ✅ uses correct constructor

        if (validator.isValidPassword()) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
