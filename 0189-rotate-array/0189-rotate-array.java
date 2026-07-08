class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        int j=nums.length-1;
         k=k%nums.length;
        while(i<j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
         int x=0;
         int l=k-1;
         while(x<l){
         int temp =nums[x];
         nums[x]=nums[l];
         nums[l]=temp;
         x++;
         l--;
         }
         int m=k;
         int n=nums.length-1;
         while(m<n){
         int temp=nums[m];
         nums[m]=nums[n];
         nums[n]=temp;
         m++;
         n--;
         }
    }
}