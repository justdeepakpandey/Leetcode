class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int fo=-1;
        int lo=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                fo=mid;
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
               r=mid-1;
            }
        }
        l=0;
        r=nums.length-1;
         while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                lo=mid;
                l=mid+1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
               r=mid-1;
            }
        }
        return new int[] {fo,lo};
    }
}