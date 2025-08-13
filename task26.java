import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The sides form a valid triangle.");
        } else {
            System.out.println("The sides do NOT form a valid triangle.");
        }

        sc.close();
    }
}
