class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int m =1;
        int n =1;
        for(int i=nums.length-1;i>=nums.length-3;i--){
            m=m*nums[i];
        }
        int i=0;
        int j=1;
        int k=nums.length-1;
        n=n*nums[i]*nums[j]*nums[k];
        return Math.max(n,m);
    }
}