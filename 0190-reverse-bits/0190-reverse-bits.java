class Solution {
    public int reverseBits(int n) {
        int[] nums = new int[32];
        Arrays.fill(nums,0);
        int i =0;
        while(n>0){
            nums[i++] = n%2;
            n/=2;
        }
        reverse(nums,0,31);
        int m =0;
        int l =1;
        
        for(int k : nums){
            m+=l*k;
            l*=2;
        }
        return m;
    }
    public static void reverse(int nums[], int l, int r){
        while(l<r){
            int t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;
            r--;
        }
    }
}