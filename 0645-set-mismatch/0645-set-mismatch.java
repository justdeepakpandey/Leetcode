class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] ans = new int[2];
        for(int i=0;i<nums.length;i++){
        int c = nums[i];
        map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i:map.keySet()){
          if(map.get(i)==2){
            ans[0]=i; 
          }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                ans[1]=i;
            }
        }
        return ans;
    }
}