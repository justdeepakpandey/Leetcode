class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2){
            return -1;
        }
        Arrays.sort(nums);
        int l=0;
        int h=nums.length-1;
        int m=l+(h-l)/2;
        return nums[m];
    }
}