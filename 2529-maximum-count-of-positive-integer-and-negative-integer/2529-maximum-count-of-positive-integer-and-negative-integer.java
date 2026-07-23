class Solution {
    public int maximumCount(int[] nums) {
        int i=0;
        int count1=0;
        int count2=0;
        while(i<nums.length){
            if(nums[i]<0){
                count1++;
               
            }
            else if(nums[i]>0){
                count2++;
            }
            i++;
        }
        return Math.max(count1,count2);
    }
}