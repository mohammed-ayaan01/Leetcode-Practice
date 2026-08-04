"""
Problem: 3731. Find Missing Elements
Link: https://leetcode.com/problems/find-missing-elements/

Approach:
Store all elements in a set for fast lookup.
Find the minimum and maximum values in nums.
Iterate through the complete range and add numbers
that are not present in the set to the result list.

Language Used: Python

Time Complexity: O(n + R)
Space Complexity: O(n)
"""
class Solution:
    def findMissingElements(self, nums):
        setobj = set(nums)

        minimum = min(nums)
        maximum = max(nums) # The Idea of Missing_number = original sum - expected sum wont work here in this case....

        lst = []

        for i in range(minimum, maximum + 1): #Total Elements Maximum + 1
            if i not in setobj: # not and in operator
                lst.append(i)

        return lst