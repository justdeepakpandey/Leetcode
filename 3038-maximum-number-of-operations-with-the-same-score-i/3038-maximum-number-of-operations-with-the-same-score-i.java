class Solution {
    public int maxOperations(int[] nums) {
        int count=0;
        int target=nums[0]+nums[1];
        for(int i=0;i<nums.length-1;i=i+2){
            int sum=0;
            for(int j=i;j<=i+1;j++){
                sum+=nums[j];
            
            }
            if(sum==target){
                count++;
            }else{
                break;
            }
            
            target=sum;
        }
        return count;
    }
}