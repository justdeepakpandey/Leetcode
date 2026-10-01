class Solution {
    public double findMaxAverage(int[] nums, int k) {
       long avg=0;
       long max=Long.MIN_VALUE;
       for(int i=0;i<k;i++){
        avg+=nums[i];


       }
    
       int j=0;
       max=Math.max(max,avg);
       for(int i=k;i<nums.length;i++){
        avg+=nums[i];
        avg=avg-nums[j];
        j++;
        max=Math.max(max,avg);
       } 
       return (double)max/k;
    }
}