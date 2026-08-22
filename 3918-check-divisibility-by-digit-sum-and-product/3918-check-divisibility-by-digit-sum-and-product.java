/**
 * Problem: Check Divisibility by Digit Sum and Product / LeetCode #3622
 * Link: https://leetcode.com/problems/check-divisibility-by-digit-sum-and-product/
 *
 * Approach:
 * Extract each digit using % 10 and / 10.
 * Calculate the sum and product of all digits.
 * Check whether n is divisible by (sum + product).
 *
 * Language Used: Java
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
 class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            sum += digit;
            prod *= digit;

            temp /= 10;
        }

        int i = sum + prod;

        return n % i == 0;
    }
}