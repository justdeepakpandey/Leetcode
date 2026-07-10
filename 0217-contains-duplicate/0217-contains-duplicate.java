class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int ch =nums[i];
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       for(int i:map.values()){
        if(i>=2){
            return true;
        }
       }
       return false;
    }
}