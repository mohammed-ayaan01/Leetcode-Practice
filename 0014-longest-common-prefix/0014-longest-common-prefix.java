/**
 * Problem: Longest Common Prefix / LeetCode #14
 * Link: https://leetcode.com/problems/longest-common-prefix/
 *
 * Approach:
 * Compare characters at the same position across all strings.
 * Use the first string as the reference and stop when a character
 * doesn't match or another string is shorter. Build the common
 * prefix using StringBuilder.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(m)
 */
 
 class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        boolean flag = true;
        for (int i = 0; i < strs[0].length(); i++) {          
            for (int j = 1; j < strs.length; j++) { 
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)){
                    flag = false;
                }
            
            }
            if(flag){
                result.append(strs[0].charAt(i));

            }else{
                break;
            }

        }
        return result.toString();
        
    }
}