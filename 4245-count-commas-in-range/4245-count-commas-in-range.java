/**
 * Problem: Count Commas in Range
 * Link: https://leetcode.com/problems/count-commas-in-range/
 *
 * Approach:
 * Numbers less than 1000 do not contain any commas.
 * Every number from 1000 to n contains exactly one comma
 * because n <= 100000.
 *
 * Therefore, if n >= 1000, the number of integers containing
 * a comma is:
 *
 *     n - 1000 + 1 = n - 999
 *
 * If n < 1000, the answer is 0.
 *
 * Language Used: Java
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Solution {
    public int countCommas(int n) {

        if (n < 1000) {
            return 0;
        }

        return n - 999;
    }
}