class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int totalzor=0;
        boolean allzero=true;
        for(int i:nums){
            totalzor=totalzor^i;
            if(i>0){
                allzero=false;
            }
        }
        if(totalzor>0){
            return n;
        }
        if(allzero==true){
            return 0;
        }else {
            return n-1;
        }
    }
}