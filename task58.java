import java.util.*;

public class task58 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(sol.exist(board, word)); // true
    }
}

class Solution {
    private int rows;
    private int cols;
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        visited = new boolean[rows][cols];

        // Small optimization: reverse if starting char rarer than ending char
        Map<Character, Integer> count = new HashMap<>();
        for (char c : word.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        if (count.getOrDefault(word.charAt(0), 0) > count.getOrDefault(word.charAt(word.length() - 1), 0)) {
            word = new StringBuilder(word).reverse().toString();
        }

        // Try to start DFS from each cell
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int r, int c, int k) {
        if (k == word.length()) {
            return true; // whole word found
        }

        // bounds & mismatch checks
        if (r < 0 || r >= rows || c < 0 || c >= cols || visited[r][c] || board[r][c] != word.charAt(k)) {
            return false;
        }

        // mark as visited
        visited[r][c] = true;

        // explore 4 directions
        boolean res = dfs(board, word, r + 1, c, k + 1) ||
                      dfs(board, word, r - 1, c, k + 1) ||
                      dfs(board, word, r, c + 1, k + 1) ||
                      dfs(board, word, r, c - 1, k + 1);

        // backtrack
        visited[r][c] = false;
        return res;
    }
}
