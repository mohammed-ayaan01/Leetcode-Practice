/**
 * Problem: Smallest Stable Index I / LeetCode #3903
 * Link: https://leetcode.com/problems/smallest-stable-index-i/
 *
 * Approach:
 * For each index i, find the maximum value from index 0 to i
 * and the minimum value from index i to n-1.
 * If max - min <= k, i is a stable index.
 * Use a while loop to check indices from left to right and
 * store the first stable index in count.
 *
 * Language Used: Java
 *
 * Time Complexity: O(nÂ²)
 * Space Complexity: O(1)
 */
 class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int count = -1;


        for(int i = 0;i < n;i++){

            int max = nums[0];

            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            int min = nums[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }

            if (max - min <= k) {
                count = i;
                break;
            }

            
        }

        return count;
    }
}