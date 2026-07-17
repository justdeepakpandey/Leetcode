class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int max =1;
        if(nums==null||nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c++;
            }else{
                c=1;
            }
            max= Math.max(max,c);
        }
        return max;
    }
}