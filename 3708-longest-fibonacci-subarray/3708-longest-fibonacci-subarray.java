class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=1;
        int c=2;
        int k=j+1;
        int max=2;
        while(k<nums.length){
            if(nums[i]+nums[j]==nums[k]){
                c++;
                i++;
                j++;
                k++;
                max=Math.max(max,c);
            }
            else{
                i++;
                j++;
                k++;
                c=2;
            }
        }
        return max;
    }
}