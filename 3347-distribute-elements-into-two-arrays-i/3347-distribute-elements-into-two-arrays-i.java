/**
 * Problem: Distribute Elements Into Two Arrays I / LeetCode #3069
 * Link: https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
 *
 * Approach:
 * Initialize arr1 with nums[0] and arr2 with nums[1].
 * For each remaining element, compare the last elements of arr1 and arr2.
 * Add the current element to the array whose last element is greater.
 * Finally, concatenate arr1 and arr2 into the result array.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int p1 = 1;
        int p2 = 1;

        for (int i = 2; i < n; i++) {

            if (arr1[p1 - 1] > arr2[p2 - 1]) {
                arr1[p1] = nums[i];
                p1++;
            } else {
                arr2[p2] = nums[i];
                p2++;
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < p1; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < p2; i++) {
            result[p1 + i] = arr2[i];
        }

        return result;
    }
}