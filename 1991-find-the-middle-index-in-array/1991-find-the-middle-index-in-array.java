class Solution {
    public int findMiddleIndex(int[] nums) {
        int rsum=0;
        int lsum=0;
        int tsum=0;
        for(int i:nums){
            tsum+=i;
        }
      for(int i=0;i<nums.length;i++){
        rsum=tsum-(lsum+nums[i]);
        if(rsum==lsum){
            return  i;
        }
        lsum+=nums[i];
      }
      return -1;
    }
}