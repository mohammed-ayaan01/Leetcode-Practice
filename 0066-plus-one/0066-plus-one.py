"""
 * Problem: Plus One / LeetCode #66
 * Link: https://leetcode.com/problems/plus-one/
 *
 * Approach:
 * Traverse the list from right to left. If the current digit is 9,
 * change it to 0 and continue carrying 1. Otherwise, increment the
 * current digit by 1 and return the list. If all digits are 9,
 * insert 1 at the beginning of the list.
 *
 * Language Used: Python
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 """
class Solution(object):
    def plusOne(self, digits):
        for i in range(len(digits))[::-1]:
            if digits[i] == 9:
               digits[i] = 0
            else:
                digits[i] = digits[i] + 1 
                return digits
        digits.insert(0,1)
        return digits