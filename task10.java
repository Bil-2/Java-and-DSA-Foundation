import java.util.Scanner;

public class task10 {

    // Declare a separate class named Circle
    static class Circle {
        int radius;

        // Constructor that initializes radius using 'this' keyword
        Circle(int radius) {
            this.radius = radius;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read radius value from user
        int r = sc.nextInt();

        // Create an object of Circle class using constructor
        Circle c = new Circle(r);

        // Print the radius using object member
        System.out.println("Radius of the circle is: " + c.radius);

        sc.close();
    }
}
