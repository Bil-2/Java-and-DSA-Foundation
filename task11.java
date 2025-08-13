import java.util.*;
public class task11{
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
       // Add the necessary code in the below space
for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half: increasing stars (start from 2 to avoid duplicate middle row)
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}