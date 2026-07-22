class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int c1=1;
        int c2=1;
        int m1=1;
        int m2=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                c1++;
                m1=Math.max(m1,c1);
                c2=1;

            }
            else if(nums[i]>nums[i+1]){
                c2++;
                m2=Math.max(c2,m2);
                c1=1;
            }else if(nums[i]==nums[i+1]){
                c1=1;
                c2=1;
            }
        }
     
       
       return Math.max(m1,m2);
    }
}