import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X coordinate: ");
        double x = sc.nextDouble();

        System.out.print("Enter Y coordinate: ");
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Point is in Quadrant I.");
        } else if (x < 0 && y > 0) {
            System.out.println("Point is in Quadrant II.");
        } else if (x < 0 && y < 0) {
            System.out.println("Point is in Quadrant III.");
        } else if (x > 0 && y < 0) {
            System.out.println("Point is in Quadrant IV.");
        } else if (x == 0 && y != 0) {
            System.out.println("Point lies on the Y-axis.");
        } else if (y == 0 && x != 0) {
            System.out.println("Point lies on the X-axis.");
        } else {
            System.out.println("Point is at the Origin.");
        }

        sc.close();
    }
}
