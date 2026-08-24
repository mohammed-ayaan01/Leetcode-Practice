/**
 * Problem: Plus One / LeetCode #66
 * Link: https://leetcode.com/problems/plus-one/
 *
 * Approach:
 * Start from the last digit and move towards the first digit.
 * If the current digit is 9, change it to 0 and continue carrying 1.
 * Otherwise, increment the current digit by 1 and return the array.
 * If all digits are 9, create a new array with an extra space and
 * put 1 at the beginning.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) in the all-9 case, otherwise O(1)
 */
 class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i = digits.length - 1;i >= 0;i--){
            if(digits[i] == 9 ){
                digits[i] = 0;
            }
            else{
                digits[i]++;
                return digits;
            }
        } // Reaches to new array if all didgits are 9.
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        for(int j = 0;j < digits.length;j++){
            arr[j + 1] = digits[j]; 
            
            return arr;

        }
        return arr;
        
    }
}