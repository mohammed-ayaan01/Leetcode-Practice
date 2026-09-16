/**
 * Problem: Rectangle Overlap / LeetCode #836
 * Link: https://leetcode.com/problems/rectangle-overlap/
 *
 * Approach:
 * Check whether the two rectangles overlap with a positive area.
 * If one rectangle is completely to the left, right, above,
 * or below the other rectangle, they do not overlap.
 *
 * Language Used: Java
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec1[2] <= rec2[0] 
        || rec2[2] <= rec1[0] // For Left side of a rectangle for rec1 and rec2 in x axis
        || rec1[3] <= rec2[1]
        || rec2[3] <= rec1[1] // For Bottom side of a rectangle for rec1 and rec2 in y axis
        ){
            return false;
        }
        return true;
    }
}