class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int m =nums.length;
        for(int i=0;i<nums.length;i++){
         int n=nums[i];
         map.put(n,map.getOrDefault(n,0)+1);
         
        }
        for(int i: map.keySet()){
           if(map.get(i)>m/2){
           return i;
           }
        }
        return -1;
        
    }
}