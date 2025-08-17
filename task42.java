public class task42 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example test case
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps: " + sol.jump(nums));
    }
}

class Solution {
    public int jump(int[] nums) {
        int near = 0, far = 0, jumps = 0;

        while (far < nums.length - 1) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            near = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;        
    }
}
