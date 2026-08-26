/**
 * Problem: Power of Two / LeetCode #231
 * Link: https://leetcode.com/problems/power-of-two/
 *
 * Approach:
 * Start with 1 and repeatedly multiply it by 2.
 * If the value becomes equal to n, then n is a power of two.
 * If the value exceeds n, then n is not a power of two.
 *
 * Language Used: Java
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
 class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean flag = false;
        for(long i = 1;i <= n;i *= 2){
            if(i == n){
                flag = true;
                break;
            }else{
                flag = false;
            }
        }
        return flag;
    }
}