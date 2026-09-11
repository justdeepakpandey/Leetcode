class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        int i=1;
        while(i<nums.length){
            while(nums[i]<=nums[i-1]){
            nums[i]=nums[i]+1;
             c++;
            }
            
            i++;
        }
        return c;
    }
}