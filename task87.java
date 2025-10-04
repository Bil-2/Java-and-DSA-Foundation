
import java.util.Scanner;

public class task87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // e.g., "5+6"

        int i = 0, j = 0;
        double output = 0;
        char[] seq = input.toCharArray();

        boolean found = false;

        for (int a = 0; a < seq.length; a++) {
            if (seq[a] == '+' || seq[a] == '-' || seq[a] == '*' || seq[a] == '/') {
                i = Integer.parseInt(input.substring(0, a));
                j = Integer.parseInt(input.substring(a + 1));

                switch (seq[a]) {
                    case '+': output = (double) i + j; break;
                    case '-': output = (double) i - j; break;
                    case '*': output = (double) i * j; break;
                    case '/': output = (double) i / j; break;
                }

                found = true;
                break; // operator found, exit loop
            }
        }

        if (!found) {
            System.out.println("Invalid input: no operator found.");
        } else {
            System.out.println(input + " = " + Math.round(output));
        }

        sc.close();
    }
}
