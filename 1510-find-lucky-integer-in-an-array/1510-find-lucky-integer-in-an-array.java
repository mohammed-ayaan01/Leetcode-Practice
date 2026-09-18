/**
 * Problem: [Name / LeetCode #]
 * Link: [problem link]
 *
 * Approach:
 * [Short explanation of the strategy]
 *
 * Language Used: [Programming Language]
 *
 * Time Complexity: O(...)
 * Space Complexity: O(...)
 */
 class Solution {
    public int findLucky(int[] arr) {
        int maximum = -1;
        for(int i = 0;i < arr.length;i++){
            int count = 0;
            for(int j = 0;j < arr.length ;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(arr[i] == count ){
                maximum = Math.max(maximum,arr[i]);
            }
            
        }
        return maximum;

    }
}