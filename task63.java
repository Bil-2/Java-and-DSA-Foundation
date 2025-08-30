import java.util.Arrays;

class task63 {
    public static void main(String[] args) {
        task63 sol = new task63();

        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};
        int[] nums3 = {7, 8, 9, 11, 12};

        System.out.println("Missing positive (nums1): " + sol.firstMissingPositive(nums1)); // 2
        System.out.println("Missing positive (nums2): " + sol.firstMissingPositive(nums2)); // 3
        System.out.println("Missing positive (nums3): " + sol.firstMissingPositive(nums3)); // 1
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Place each number in its right place if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Now check which index doesn't have the right number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
