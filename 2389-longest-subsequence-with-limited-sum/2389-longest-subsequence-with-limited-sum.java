class Solution {
    public int[] answerQueries(int[] nums, int[] q) {
        Arrays.sort(nums);
        int[] ans = new int[q.length];
        for(int i=0;i<q.length;i++){
            int c=0;
            int sum=0;
            for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(sum<=q[i]){
                c++;
            }
            }
            ans[i]=c;
        }
        return ans;
    }
}