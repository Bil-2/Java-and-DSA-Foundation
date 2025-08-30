public class task62 {
    public static void main(String[] args) {
        task62 sol = new task62();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println("Duplicate: " + sol.findDuplicate(nums)); // Output: 2
    }

    public int findDuplicate(int[] nums) {
        // Phase 1: Detect cycle (intersection point)
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entrance to cycle (duplicate number)
        int slow2 = nums[0];
        while (slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
}
