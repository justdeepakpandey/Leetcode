class Solution {
    public boolean lemonadeChange(int[]nums) {
        if(nums[0]!=5){
            return false;
        }
        int c5=0;
        int c10=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]==5){
           c5++;
        }
        if(nums[i]==10){
            if(c5<1){
                return false;
            
            }
            else{
                c10++;
                c5--;
            }
        }
     if(nums[i]==20){
            if(c5<1){
                return false;

            }
            if(c10>=1&&c5>=1){
                c5--;
                c10--;
            }
            if(c10<1&&c5>=3){
                c5=c5-3;
            }
          
        }
        }
        return true;
    }
}