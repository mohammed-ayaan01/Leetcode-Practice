/**
 * Problem: Removing Stars From a String / LeetCode #2390
 * Link: https://leetcode.com/problems/removing-stars-from-a-string/
 *
 * Approach:
 * Use a Stack to store characters. For every normal character, push it
 * onto the stack. When a '*' is encountered, pop the previous character.
 * Finally, use StringBuilder to construct the resulting string.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) != '*'){
                st.push(s.charAt(i));
            }else{
                st.pop();
            }

        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st){ // To access the value in StringBuilder
            sb.append(ch);
        }
        return sb.toString();
    }
}