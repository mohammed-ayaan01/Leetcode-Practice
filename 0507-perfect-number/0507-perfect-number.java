/**
 * Problem: Perfect Number / LeetCode #507
 * Link: https://leetcode.com/problems/perfect-number/
 *
 * Approach:
 * Iterate from 1 to num - 1 and find all divisors of num.
 * Add the divisors to sum. If the sum of all proper divisors
 * is equal to num, then num is a perfect number.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
 class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1;i < num - 1;i++){
            if(num % i == 0){
                sum += i;

            }
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
}