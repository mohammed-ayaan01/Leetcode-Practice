"""
 * Problem: Palindrome Number / #0009
 * Link: https://leetcode.com/problems/palindrome-number/
 *
 * Approach:
 * Reverse The given Number and compare with the original number 
 * 
 * Used Basic % 10 and / 10 and assigned to a variable
 *
 * Language Used: Python
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
"""

class Solution(object):
    def isPalindrome(self, x):
        z = 0
        temp = x
        while(temp > 0):
            z = (temp % 10) + z * 10
            temp //= 10
        if z == x:
            return True
        else:
            return False