/**
 * Problem: Find the Index of the First Occurrence in a String / LeetCode #28
 * Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 *
 * Approach:
 * Use contains() to check whether the needle exists in the haystack.
 * If it exists, use indexOf() to return its first occurrence index.
 * Otherwise, return -1.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
 class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }
        
    }
}