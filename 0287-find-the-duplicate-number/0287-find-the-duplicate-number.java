class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map  = new HashMap<>();
        int a =0;
        for(int i=0;i<nums.length;i++){
            int c = nums[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i: map.keySet()){
            if(map.get(i)>=2){
               a=i;
            }
        }
        return a;
    }
}