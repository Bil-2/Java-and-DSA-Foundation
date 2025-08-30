public class task59 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,3,1,1,4};
        System.out.println(sol.jump(nums)); // Output: 2
    }
}

class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;   // farthest we can reach in current jump
        int farthest = 0;     // farthest we can reach overall

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {   // end of current jump
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
