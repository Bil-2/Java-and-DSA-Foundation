import java.util.Scanner;

interface GCD {
    int findGCD(int n1, int n2);
}

// Class B implementing the GCD interface
class B implements GCD {
    @Override
    public int findGCD(int n1, int n2) {
        // Return -1 if either argument is negative
        if (n1 < 0 || n2 < 0) {
            return -1;
        }
        // Base case: if n2 is 0, gcd is n1
        if (n2 == 0) {
            return n1;
        }
        // Recursive call using Euclidean algorithm
        return findGCD(n2, n1 % n2);
    }
}

public class task54 {
    public static void main(String[] args) {
        B a = new B(); // Create an object of class B
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        System.out.print(a.findGCD(p1, p2));
    }
}
