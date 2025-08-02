import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.println(Math.PI * r * r * h); // <-- One line formula

        sc.close();
    }
}
