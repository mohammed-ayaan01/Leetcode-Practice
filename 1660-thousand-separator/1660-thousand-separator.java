/**
 * Problem: Thousand Separator (LeetCode #1556)
 * Link: https://leetcode.com/problems/thousand-separator/
 *
 * Approach:
 * Traverse the number from right to left and append each digit to a
 * StringBuilder. After every 3 digits, append a '.' if digits remain.
 * Finally, reverse the StringBuilder to obtain the correctly formatted number.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(n);
        int count = 0;
        for(int i = s.length() - 1; i >= 0;i--){
            
            count++;
            sb.append(s.charAt(i));
            if(count == 3 && i != 0){
                sb.append('.');
                count = 0;
            }

        }
            return sb.reverse().toString();
    }
}
// use sb.insert approach to solve the same problem.