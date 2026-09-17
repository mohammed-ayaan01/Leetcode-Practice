/**
 * Problem: Shuffle String / LeetCode #1528
 * Link: https://leetcode.com/problems/shuffle-string/
 *
 * Approach:
 * Create a character array and place each character of the
 * string at the position specified by the indices array.
 * Finally, convert the character array into a String.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        if(s.length() == 0 || s.charAt(0) == ')' ||s.charAt(0) == ']' ||s.charAt(0) == '}' ){
            return false;
        }
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }

            else if(st.isEmpty() == false && s.charAt(i) == ')'&& st.peek() == '('  ){
                st.pop();
            }
            else if(st.isEmpty() == false && s.charAt(i) == ']'&& st.peek() == '['  ){
                st.pop();
            }   
            else if(st.isEmpty() == false && s.charAt(i) == '}'&& st.peek() == '{'  ){
                st.pop();
            }else{
                return false;
            }

        } 
        return st.isEmpty();
    }
}