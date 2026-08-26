class Solution {
    public int specialArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            max=Math.max(max,i);
        }
        while(max>0){
            int count=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=max){
                    count++;
                }
            }
                if(count==max){
                    return max;
                }
              
            
            max=max-1;
        }
        return -1;
    }
}