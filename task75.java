// File: W07_P1.java
import java.util.Scanner;

public class task75 {
    
    // Method to find the longest word
    public static String findLongestWord(String text) {
        String longestWord = "";
        String[] words = text.split(" "); // Split input by spaces

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user input (whole line)
        String text = scanner.nextLine();

        scanner.close();

        // Find longest word
        String longestWord = findLongestWord(text);

        // Display result
        System.out.println("The longest word in the text is: " + longestWord);
    }
}
