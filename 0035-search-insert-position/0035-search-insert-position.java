/**
 * Problem: Search Insert Position (LeetCode #35)
 * Link: https://leetcode.com/problems/search-insert-position/
 *
 * Approach:
 * Use binary search on the sorted array. If the target is found,
 * return its index. If the target is smaller, search the left half;
 * otherwise, search the right half. If the target is not found,
 * left represents the index where the target should be inserted.
 *
 * Language Used: Java
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(nums != null && nums.length != 0 && left <= right){
        int mid = (left + right)/2; // (or) left + (right - left)/2
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }

        }
        return left;


    }
}