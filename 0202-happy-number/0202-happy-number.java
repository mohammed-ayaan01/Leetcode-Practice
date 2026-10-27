class Solution {
    public boolean isHappy(int n) {
        int slow = n,fast = n;
        while(fast != 1){
            slow = SumOfSquares(slow);
            fast = SumOfSquares(SumOfSquares(fast));

            if(fast != 1 && slow==fast){
                return false;
            }

        }
        return true;

    }
    int SumOfSquares(int n){
        int temp = n;
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            temp /= 10;
            sum+=digit*digit;
        }
        return sum;
        

    }
}