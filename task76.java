// File: W07_P2.java
import java.util.Scanner;

public class task76 {
    
    // Method to find the longest word
    public static String findLongestWord(String text) {
        String longestWord = "";
        String[] words = text.split("\\s+"); // Split input by spaces

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input sentence
        String text = scanner.nextLine();

        scanner.close();

        // Find the longest word
        String longestWord = findLongestWord(text);

        // Print result
        System.out.println("The longest word in the text is: " + longestWord);
    }
}
