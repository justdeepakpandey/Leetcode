class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        int j=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.get(nums[i])<=k){
                max=Math.max(max,i-j+1);
            }
            else{
              while(map.get(nums[i])>k){
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0){
                    map.remove(nums[j]);
                }
                j++;
              }

            }
        }
        return max;
    }
}