class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Double.NEGATIVE_INFINITY;
        double sum =0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
            max=Math.max(sum,max);
        }
        max=sum;
           int i=k;
            int j=0;
            while(i<nums.length){
                sum=sum+nums[i];
                sum=sum-nums[j];
              
               
                max=Math.max(sum,max);
                i++;
                j++;
            }
        
        return max/k;
    }
}