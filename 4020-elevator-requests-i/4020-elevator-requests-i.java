class Solution {
    public int elevatorRequests(int n, int[] nums) {
        int sum=0;
         sum+=nums[0];
        for(int i=1;i<nums.length;i++){
           
            sum+=Math.abs(nums[i]-nums[i-1]);
        }
        return sum;
    }
}