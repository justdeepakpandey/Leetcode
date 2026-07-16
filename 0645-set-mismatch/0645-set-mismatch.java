class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c = nums[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
         for(int i:map.keySet()){
            if(map.get(i)==2){
                list.add(i);
            }
         }
         HashSet<Integer> set = new HashSet<>();
         for(int i:nums){
            set.add(i);
         }
         for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
         }

        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}