import java.util.ArrayList;
import java.util.List;

public class java43 {
    // Inner class with subset logic
    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> subset = new ArrayList<>();
            createSubset(nums, 0, res, subset);
            return res;
        }

        private void createSubset(int[] nums, int index, List<List<Integer>> res, List<Integer> subset) {
            if (index == nums.length) {
                res.add(new ArrayList<>(subset));
                return;
            }

            // include current number
            subset.add(nums[index]);
            createSubset(nums, index + 1, res, subset);

            // exclude current number
            subset.remove(subset.size() - 1);
            createSubset(nums, index + 1, res, subset);
        }
    }

    // ✅ Main method to run the program
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = sol.subsets(nums);

        System.out.println("All subsets:");
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }
    }
}
