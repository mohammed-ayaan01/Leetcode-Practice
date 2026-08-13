"""
 * Problem: Length of Last Word / LeetCode #58
 * Link: https://leetcode.com/problems/length-of-last-word/
 *
 * Approach:
 * Split the string into words and return the length of the last word.
 * split() automatically handles leading, trailing, and multiple spaces.
 *
 * Language Used: Python
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 """
class Solution(object):
    def lengthOfLastWord(self, s):
        a = s.split()
        return len(a[-1])
        