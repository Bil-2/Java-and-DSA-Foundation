import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean isValid = true;

        if (year <= 0 || month < 1 || month > 12 || day < 1) {
            isValid = false;
        } else {
            int daysInMonth;
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    daysInMonth = isLeap ? 29 : 28;
                    break;
                default:
                    daysInMonth = 0;
            }

            if (day > daysInMonth) {
                isValid = false;
            }
        }

        if (isValid) {
            System.out.println("Valid date: " + day + "/" + month + "/" + year);
        } else {
            System.out.println("Invalid date!");
        }

        sc.close();
    }
}
