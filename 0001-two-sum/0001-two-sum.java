/**
 * Problem: Two Sum / #0001
 * Link: https://leetcode.com/problems/two-sum/description/
 *
 * Approach:
 * Brute Force Approach is Used Where we are traversing and scanning each element
 *
 * Language Used: Java
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        for(int i = 0; i < n;i++){
            for(int j = i + 1;j < n;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};

                }
            }
        }
        return nums;
    }

}
