 import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and width of the rectangle
        int length = sc.nextInt();
        int width = sc.nextInt();

        // Calculate perimeter
        int perimeter = 2 * (length + width);

        // Print the perimeter
        System.out.println("Perimeter is: " + perimeter);

        sc.close();
    }
}
 
