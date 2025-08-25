import java.util.Scanner;

interface Number {
    int findSqr(int i);  // Returns the square of n
}

// Class A implementing Number interface
class A implements Number {
    // Implement findSqr method
    public int findSqr(int i) {
        return i * i;
    }
}

public class task53 {
    public static void main(String[] args) {
        A a = new A(); // Create an object of class A
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(a.findSqr(i));
    }
}
