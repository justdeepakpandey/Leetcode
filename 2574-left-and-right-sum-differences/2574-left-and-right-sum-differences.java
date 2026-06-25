class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n =nums.length;
        int[] lsum=new int[n];
        int[] rsum =new int[n];
        int[] ans =new int[n];
        int s1 =0;
        for(int i=1;i<n;i++){
           
            lsum[i]=lsum[i]+nums[i-1]+s1;
             s1=s1+nums[i-1];
        }
        int s2=0;
        for(int i=n-2;i>=0;i--){
          
            rsum[i]=rsum[i]+nums[i+1]+s2;
            s2=s2+nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(rsum[i]-lsum[i]);
        }
        return ans;
    }
}