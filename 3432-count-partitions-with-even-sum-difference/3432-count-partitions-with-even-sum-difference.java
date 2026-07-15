class Solution {
    public int countPartitions(int[] nums) {
        int sum1=0;
        int sum2=0;
         int tsum=0;
         int count=0;
         int j=0;
        for(int i=0;i<nums.length;i++){
             tsum=tsum+nums[i];
        }
        while(j<nums.length){
              sum1+=nums[j];
              sum2=tsum-sum1;
              if(Math.abs(sum1-sum2)%2==0){
                  count=count+1;
              }
              j++;
        }
        if(count==0){
            return 0;
        }
        return count-1;
    }
}