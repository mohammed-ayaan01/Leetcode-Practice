/**
 * Problem: 1518. Water Bottles
 * Link: https://leetcode.com/problems/water-bottles/
 *
 * Approach:
 * First drink all the initial bottles and count them.
 * Keep exchanging empty bottles for full bottles while there
 * are enough empty bottles for an exchange.
 * After drinking the exchanged bottles, add them back as empty bottles.
 *
 * Language Used: Java
 *
 * Time Complexity: O(log(numBottles))
 * Space Complexity: O(1)
 */
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int empty_bottles = numBottles; // initializing ur drinking all full bottles..... using empty_bottles as temp here....
        
        while(empty_bottles >= numExchange){ // You drink exchange bottles if numExchange is satisfied...
        int full_bottles = empty_bottles / numExchange;
        empty_bottles = empty_bottles % numExchange;
        sum += full_bottles;
        empty_bottles += full_bottles ; // After Drinking Empty Bottle It counts in Total Bottles...
        }
        
        return sum;

    }
}