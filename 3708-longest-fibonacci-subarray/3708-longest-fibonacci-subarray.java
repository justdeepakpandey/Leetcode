class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=i+1;
        int k=j+1;
        int count=2;
     if(nums.length<=2){
        return nums.length;
     }
 int max=0;
        while(k<nums.length){
            if(nums[i]+nums[j]==nums[k]){
                count++;
                 i++;
                 j++;
                 k++;
            }else{
                count=2;
                i++;
                j++;
                k++;
            }
            max=Math.max(count,max);
           
        }
        return max;
    }
}