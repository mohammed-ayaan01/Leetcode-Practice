"""
 * Problem: Two Sum / #0001
 * Link: https://leetcode.com/problems/two-sum/description/
 *
 * Approach:
 * Brute Force Approach is Used Where we are traversing and scanning each element
 *
 * Language Used: Python
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 """

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums)):
            for j in range(i + 1,len(nums)):
                if nums[i] + nums[j] == target:
                    return [i,j]
            
        return []


        
