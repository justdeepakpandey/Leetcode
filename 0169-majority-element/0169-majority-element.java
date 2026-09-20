class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
               int a=nums[i];
               map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>nums.length/2){
                max=i;
            }
        }
        return max;
    }
}