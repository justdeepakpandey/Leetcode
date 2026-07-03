class Solution {
    public int missingNumber(int[] nums) {
        int m=(nums.length)*(nums.length+1);
        int o=m/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return o-sum;
    }
}