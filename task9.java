import java.util.Scanner;

public class task9 {

    // Declare a class named Rectangle
    static class Rectangle {
        int length;
        int width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read length and width
        int l = sc.nextInt();
        int w = sc.nextInt();

        // Create an object of the Rectangle class
        Rectangle rect = new Rectangle();

        // Assign values to the object's member variables
        rect.length = l;
        rect.width = w;

        // Calculate and print the sum
        int sum = rect.length + rect.width;
        System.out.println("Sum of length and width is: " + sum);

        sc.close();
    }
}
