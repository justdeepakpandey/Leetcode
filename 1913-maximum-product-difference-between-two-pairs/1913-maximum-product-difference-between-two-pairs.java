class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int z =nums.length-1;
        int y=nums.length-2;
        int w =0;
        int x =1;
        int ans =(nums[z]*nums[y])-(nums[w]*nums[x]);
        return ans;
    }
}