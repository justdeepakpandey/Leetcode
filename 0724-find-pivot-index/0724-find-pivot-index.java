class Solution {
    public int pivotIndex(int[] nums) {
        int tsum=0;
        int lsum=0;
        int rsum=0;
    
        for(int i=0;i<nums.length;i++){
            tsum=tsum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            rsum=tsum-(lsum+nums[i]);

            if(rsum==lsum){
                return i;
            }
           
            lsum=lsum+nums[i];
             

        }
        return -1;
       
    }
}