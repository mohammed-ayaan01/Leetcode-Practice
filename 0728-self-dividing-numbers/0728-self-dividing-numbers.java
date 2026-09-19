class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int temp = 0;
        boolean flag = false;
        List<Integer> lst = new ArrayList<>();
        for(int i = left;i <= right;i++){
            temp = i;
            while(temp > 0){
                int a = temp % 10;
                if(a == 0 || i % a != 0){
                    flag = false;
                    break;
                }else{
                    flag = true;
                    
                }
                temp /= 10;
            }
            if(flag == true){
                lst.add(i);
            }else{
                continue;
            }
            



        }
        return lst;
    }
}