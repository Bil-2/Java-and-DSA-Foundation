import java.util.Scanner;

public class task13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Special case for 0
        if (num == 0) {
            System.out.println(1);
            return;
        }

        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println(count);
    }
}
