/**
 * Problem: Smallest Missing Multiple of K
 * Link: https://leetcode.com/problems/smallest-missing-multiple-of-k/
 *
 * Approach:
 * First, store all multiples of k from the array in an ArrayList.
 * Sort the ArrayList and check the multiples of k in increasing order.
 * Duplicate values are skipped. The first missing multiple is returned.
 *
 * Language Used: Java
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution {
    public int missingMultiple(int[] nums, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % k == 0) {
                list.add(nums[i]);
            }
        }

        Collections.sort(list);

        int sum = k;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) < sum) {
                continue;
            }

            if (list.get(i) == sum) {
                sum += k;
            } else {
                return sum;
            }
        }

        return sum;
    }
}