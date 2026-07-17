class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
             int sum=0;
            for(int j=i;j<nums.length;j++){
               sum=sum+nums[j];
               list.add(sum);
            }
        }
      int idx=0;
      int idx2 =0;
      long ans=0;
      list.add(0);
      Collections.sort(list);
     while(left<=right){
        ans=ans+list.get(left);
        left++;
     }
      return  (int)(ans % 1000000007);
      
    }
}