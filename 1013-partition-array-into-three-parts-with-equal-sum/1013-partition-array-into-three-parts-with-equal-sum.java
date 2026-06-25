class Solution {
    public boolean canThreePartsEqualSum(int[] nums) {
    int tsum=0;
    int d=0;
    int sum=0;
    int count=0;
 
    
    for(int i=0;i<nums.length;i++){
        tsum=tsum+nums[i];
       
       
          
}
 if (tsum % 3 != 0) {
            return false;

    }
   d=tsum/3;
    
    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
        if(sum==d){
            count++;
            sum=0;
        }
  
        
    }
    if(count>=3){
        return true;
    }
    return false;
    }
}