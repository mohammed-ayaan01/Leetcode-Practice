/**
 * Problem: Third Maximum Number / LeetCode #414
 * Link: https://leetcode.com/problems/third-maximum-number/
 *
 * Approach:
 * Sort the array in ascending order and traverse it from right to left.
 * Count distinct elements. When the third distinct maximum is found,
 * return it. If there are fewer than three distinct elements, return
 * the maximum element.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(log n)
 */
 class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int maximum = Integer.MIN_VALUE;
        int count = 0;
        for(int i = nums.length - 1;i >= 0;i--){
            if(maximum != nums[i]){
                maximum = Integer.MIN_VALUE;
                maximum = Math.max(maximum,nums[i]);
                count++;
                
            }else{
                continue;
            }
            if(count == 3){
                return maximum;
            }
            
            

        }
        if(count < 3){
            return nums[nums.length - 1];
        }

        return maximum;

        
    }
}