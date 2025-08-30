public class taskMedian {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + sol.findMedianSortedArrays(nums1, nums2)); // 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + sol.findMedianSortedArrays(nums3, nums4)); // 2.5
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is smaller
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int len1 = nums1.length, len2 = nums2.length;
        int left = 0, right = len1;

        while (left <= right) {
            int part1 = (left + right) / 2;
            int part2 = (len1 + len2 + 1) / 2 - part1;

            int maxLeft1  = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
            int minRight1 = (part1 == len1) ? Integer.MAX_VALUE : nums1[part1];
            int maxLeft2  = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
            int minRight2 = (part2 == len2) ? Integer.MAX_VALUE : nums2[part2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Found correct partition
                if ((len1 + len2) % 2 == 0) {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return (double) Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                right = part1 - 1; // move cut left
            } else {
                left = part1 + 1;  // move cut right
            }
        }
        return 0.0;        
    }
}
