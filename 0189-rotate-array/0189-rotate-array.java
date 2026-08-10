class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
        k=k%nums.length;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        int l=0;
        int m=k-1;
        while(l<m){
            int temp=nums[l];
            nums[l]=nums[m];
            nums[m]=temp;
            l++;
            m--;
        }
        int n=k;
        int o=nums.length-1;
        while(n<o){
            int temp=nums[n];
            nums[n]=nums[o];
            nums[o]=temp;
            n++;
            o--;
        }
    }
}