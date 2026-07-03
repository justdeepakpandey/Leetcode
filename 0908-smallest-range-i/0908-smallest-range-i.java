class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
       min=min+k;
       max=max-k;
       while(min>max){
        max=max+1;

       }
       ans=Math.abs(max-min);
       return ans;

    }
}