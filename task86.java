import java.util.Scanner;

public class task86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 5x5 array to store input
        char original[][] = new char[5][5];

        for (int line = 0; line < 5; line++) {
            if (!sc.hasNextLine()) {
                System.out.println("Insufficient input.");
                sc.close();
                return;
            }

            String input = sc.nextLine().trim();

            if (input.length() != 5) {
                System.out.println("Invalid length");
                sc.close();
                return;
            }

            for (int i = 0; i < 5; i++) {
                char ch = input.charAt(i);
                if (ch == '0' || ch == '1') {
                    original[line][i] = ch;
                } else {
                    System.out.println("Only 0 and 1 supported.");
                    sc.close();
                    return;
                }
            }
        }

        sc.close();
        flipflop(original);
    }

    static void flipflop(char[][] flip) {
        // Flip bits
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                flip[i][j] = (flip[i][j] == '1') ? '0' : '1';
            }
        }

        // Print result
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(flip[i][j]);
            }
            System.out.println();
        }
    }
}
