class Solution {
    public int firstMissingPositive(int[] nums) {
        int ans=0;
        HashSet<Integer> list = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(list.contains(i)){
                continue;
            }

          else{
            ans=i;
            break;
          }
        }
      return ans;
    }
}