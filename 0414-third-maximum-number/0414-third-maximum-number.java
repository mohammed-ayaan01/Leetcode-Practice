class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int maximum = Integer.MIN_VALUE;
        int count = 0;
        for(int i = nums.length - 1;i >= 0;i--){
            if(maximum != nums[i]){
                maximum = Integer.MIN_VALUE;
                maximum = Math.max(maximum,nums[i]);
                count++;
                
            }else{
                continue;
            }
            if(count == 3){
                return maximum;
            }
            
            

        }
        if(count < 3){
            return nums[nums.length - 1];
        }

        return maximum;

        
    }
}