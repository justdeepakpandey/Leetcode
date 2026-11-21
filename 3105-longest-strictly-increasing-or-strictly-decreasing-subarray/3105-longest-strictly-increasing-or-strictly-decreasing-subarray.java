class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int minc=0;
       int mdec=0;
        if(nums.length<=1){
            return nums.length;
        }
        for(int j=1;j<nums.length;j++){
            int inc =1;
        for(int i=j;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
            }
            else{
                break;
            }
          
        }
          minc=Math.max(inc,minc);

        }
         for(int j=1;j<nums.length;j++){
             int dec=1;
        for(int i=j;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                dec++;
            }
            else{
                break;
            }
           
        }
             mdec=Math.max(dec,mdec);
        }
       
        return Math.max(mdec,minc);

    }
}