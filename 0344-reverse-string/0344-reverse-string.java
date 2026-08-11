/**
 * Problem: Reverse String / LeetCode #344
 * Link: https://leetcode.com/problems/reverse-string/
 *
 * Approach:
 * Use two pointers, one starting from the beginning and
 * one from the end. Swap the characters and move both
 * pointers toward the center until they meet.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}