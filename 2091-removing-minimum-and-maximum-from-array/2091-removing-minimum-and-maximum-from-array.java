class Solution {
    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int a=0;
        int b =0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
               a=i+1;
            }
            if(nums[i]==max){
                b=i+1;
            }
        }
        int c =Math.max(a,b);
        int d=0;
        int e=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==min){
               d=n-i;
            }
            if(nums[i]==max){
                e=n-i;
            }
        }
        int f =Math.max(d,e);
        int g=0;
        int h=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min||nums[i]==max){
               g=i+1;
               break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==min||nums[i]==max){
                    h=n-i;
                    break;
            }
        }
        int k=g+h;
       
   int m = Math.min(c, Math.min(f, k));
return m;
    }
}