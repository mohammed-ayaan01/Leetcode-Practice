/**
 * Problem: First Unique Character in a String / LeetCode #387
 * Link: https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Approach:
 * Traverse the string and, for each character, compare it with every
 * other character. If the character does not occur at any other index,
 * return its index. If no unique character is found, return -1.
 *
 * Language Used: Java
 *
 * Time Complexity: O(nÂ²)
 * Space Complexity: O(1)
 */
class Solution {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            boolean flag = true;

            for (int j = 0; j < s.length(); j++) {

                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return i;
            }
        }

        return -1;
    }
}