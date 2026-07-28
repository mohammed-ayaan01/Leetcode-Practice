/**
 * Problem: Find Numbers with Even Numbers of Digits
 * Link: leetcode.com/problems/find-numbers-with-even-number-of-digits/
 *
 * Approach:
 * Math and Arrays
 *
 * Language Used: Java
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public int findNumbers(int[] nums) {
            int digit = 0;
        for(int i = 0;i < nums.length;i++){
        int count = 0;
            int temp = nums[i];
            while(temp > 0){ 
                temp = temp / 10; //Remove the Last Element
                count++;
            }
            if(count % 2 == 0){ //To Check Even Number
                digit++;
            }
        }
        return digit;
    }
}