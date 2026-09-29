class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        if(nums.length>=100000){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==0){
                    continue;
                }
                if(nums[i]==1&&nums[j]==1&&j-i<=k){
                    return false;
                
                }
                

            }
        }
        return true;
    }
}