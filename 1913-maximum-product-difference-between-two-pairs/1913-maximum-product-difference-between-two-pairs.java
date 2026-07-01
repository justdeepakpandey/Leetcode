class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int x=nums.length-1;
        int y =nums.length-2;
        int ans =(nums[i]*nums[j])-(nums[x]*nums[y]);
        return Math.abs(ans);
    }
}