/**
 * Problem: Remove Element / LeetCode #27
 * Link: https://leetcode.com/problems/remove-element/
 *
 * Approach:
 * Use two pointers. The right pointer scans through the array,
 * while the left pointer keeps track of the position where the
 * next element that is not equal to val should be placed.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
 class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }
}