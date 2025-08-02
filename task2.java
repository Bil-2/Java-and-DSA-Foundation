 import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();

        // One-line calculation for cylinder volume
        System.out.println(Math.PI * radius * radius * height);

        in.close();
    }
}

