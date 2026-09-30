class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            arr[i]=Math.min(nums[i],arr[i+1]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            int value=max-arr[i];
            if(value<=k){
                return i;
            }

        }
        return -1;
        
    }
}