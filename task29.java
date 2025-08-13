import java.util.Scanner;

public class task29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price (CP): ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling Price (SP): ");
        double sp = sc.nextDouble();

        if (sp > cp) {
            System.out.println("Profit: " + (sp - cp));
        } else if (sp < cp) {
            System.out.println("Loss: " + (cp - sp));
        } else {
            System.out.println("No Profit, No Loss.");
        }

        sc.close();
    }
}
