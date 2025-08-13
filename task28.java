import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase.");
        } else {
            System.out.println("Invalid input! Not an alphabet.");
        }

        sc.close();
    }
}
