/**
 * Problem: 202. Happy Number
 * Link: https://leetcode.com/problems/happy-number/
 *
 * Approach:
 * Repeatedly calculate the sum of the squares of the digits.
 * If the number becomes 1, it is a happy number.
 * If it reaches 4, it enters a repeating cycle and is not a happy number.
 *
 * Language Used: Java
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isHappy(int n) {

        while (n != 1 && n != 4) { // Using 4 because Eventually Every Unhappy Number Reaches 4 at some point and goes to infinite loop...
            int temp = n;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp = temp / 10;
            }

            n = sum;
        }

        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}