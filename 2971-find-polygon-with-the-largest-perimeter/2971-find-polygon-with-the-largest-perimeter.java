class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--){
            sum=sum-nums[j];
            if(nums[j]>sum){
                continue;
            }
            if(sum>nums[j]&&j>=2){
                return sum+nums[j];
            }
        }
        return -1;
    }
}