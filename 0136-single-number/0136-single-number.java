/**
 * Problem: Single Number / LeetCode #136
 * Link: https://leetcode.com/problems/single-number/
 *
 * Approach:
 * Use XOR to find the number that appears only once.
 * Since a number XORed with itself becomes 0, all duplicate
 * numbers cancel each other out. XORing with 0 leaves the
 * single number unchanged.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public int singleNumber(int[] nums) {
        int temp = 0;
        for(int i = 0;i < nums.length;i++){
            temp = temp ^ nums[i]; // The duplicates cancel as 0 in XOR 
        }
        return temp;
    }
}