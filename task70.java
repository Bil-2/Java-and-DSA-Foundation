public class task70 {

    static class Solution {
        public boolean isPalindrome(String s) {
            if (s.isEmpty()) return true;

            int start = 0, last = s.length() - 1;
            while (start <= last) {
                char currFirst = s.charAt(start);
                char currLast = s.charAt(last);

                if (!Character.isLetterOrDigit(currFirst)) {
                    start++;
                } else if (!Character.isLetterOrDigit(currLast)) {
                    last--;
                } else {
                    if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                        return false;
                    }
                    start++;
                    last--;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "";

        System.out.println(sol.isPalindrome(s1)); // true
        System.out.println(sol.isPalindrome(s2)); // false
        System.out.println(sol.isPalindrome(s3)); // true
    }
}
