import java.util.Scanner;

public class task6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and width of the rectangle
        int length = sc.nextInt();
        int width = sc.nextInt();

        // Calculate area
        int area = length * width;

        // Print the result
        System.out.print("Area is: " + area);

        sc.close();
    }
}
