import java.util.Stack;

public class task67 {

    static class Solution {
        public int longestValidParentheses(String s) {
            Stack<Integer> stack = new Stack<>();
            stack.push(-1);
            int maxLen = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                } else {
                    stack.pop();
                    if (stack.isEmpty()) {
                        stack.push(i);
                    } else {
                        maxLen = Math.max(maxLen, i - stack.peek());
                    }
                }
            }

            return maxLen;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "(()";
        String s2 = ")()())";
        String s3 = "";

        System.out.println("Longest valid parentheses (s1): " + sol.longestValidParentheses(s1)); // 2
        System.out.println("Longest valid parentheses (s2): " + sol.longestValidParentheses(s2)); // 4
        System.out.println("Longest valid parentheses (s3): " + sol.longestValidParentheses(s3)); // 0
    }
}
