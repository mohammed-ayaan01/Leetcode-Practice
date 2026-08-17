/**
 * Problem: Remove Duplicates from Sorted Array (LeetCode #26)
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Approach:
 * Use two pointers. The right pointer scans the array to find unique
 * elements, while the left pointer keeps track of the position where
 * the next unique element should be placed.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
 class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int count = 1;

        while(right < nums.length){
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
                count ++;
                
            }
            right++;
        }
        return count;
    }
}