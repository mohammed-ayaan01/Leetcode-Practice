/**
 * Problem: Smallest Number With Digit Product Divisible by T
 * LeetCode #3345
 * Link: https://leetcode.com/problems/smallest-divisible-digit-product-i/
 *
 * Approach:
 * Starting from n, calculate the product of its digits.
 * If the product is divisible by t, return the number.
 * Otherwise, recursively check the next number.
 *
 * Language Used: Java
 *
 * Time Complexity: O(k * log n)
 * Space Complexity: O(k)
 */
 
class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;
        int digit = 1;
        while(temp > 0){
            digit *= temp % 10;
 
            temp /= 10;
        }
        if(digit %t == 0){
            return n;
        }else{
            return smallestNumber(n + 1,t);

        }


    }
}