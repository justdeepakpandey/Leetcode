class Solution {
    public int majorityElement(int[] nums) {
        int c=0;int m=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                m=nums[i];
            }
            if(nums[i]==m){
                c++;
            }else{
                c--;
            }
        }
        return m;
    }
}