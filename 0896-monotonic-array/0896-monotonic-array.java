class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums[0]>nums[nums.length-1]){
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    continue;
                }else if(nums[i]>nums[i-1]){
                    return false;
                }
            }
        }
        else if(nums[0]<nums[nums.length-1]){
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    continue;
                }
                else if(nums[i]<nums[i-1]){
                    return false;
                }
            }
        }
        else if(nums[0]==nums[nums.length-1]){
         for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else if(nums[i]!=nums[i-1]){
                return false;
            }
         }
        }
        return true;
    }
}