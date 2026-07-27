"""
Problem: Two Sum (LeetCode #1)
Link: https://leetcode.com/problems/two-sum/

Approach:
Brute Force — check every pair (i, j) and see if they sum to target.

Language Used: Python

Time Complexity: O(n^2)
Space Complexity: O(1)
"""

from typing import List

def two_sum(nums: List[int], target: int) -> List[int]:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
    return []