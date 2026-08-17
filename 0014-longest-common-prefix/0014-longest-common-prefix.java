/**
 * Problem: Longest Common Prefix / LeetCode #14
 * Link: https://leetcode.com/problems/longest-common-prefix/
 *
 * Approach:
 * Sort the array of strings lexicographically. After sorting, the strings
 * at the first and last positions will have the maximum difference.
 * Therefore, their common prefix will also be the common prefix of all
 * strings. Compare characters of the first and last strings until a
 * mismatch is found, then return the matching prefix.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n log n * m)
 * Space Complexity: O(1) auxiliary space
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null && strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String first=strs[0];//flight
        String last=strs[strs.length-1];//flower
        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}