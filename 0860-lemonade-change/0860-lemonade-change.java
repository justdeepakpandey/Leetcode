class Solution {
    public boolean lemonadeChange(int[] nums) {
        if(nums[0]!=5){
            return false;

        }
        int cf=0;
        int ct=0;
        int cty=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==5){
                cf++;
            }
            else if(nums[i]==10){
                if(cf>0){
                    cf--;
                }
                else{
                    return false;
                }
                ct++;
            }
            else{
                if(cf>0&&ct>0){
                    cf--;
                    ct--;
                }
                else if(cf>=3){
                    cf=cf-3;
                }
                else{
                    return false;
                }
            }
                
        }      
               
          return true;
    }
}