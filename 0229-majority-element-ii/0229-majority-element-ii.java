class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)>nums.length/3){
              list.add(i);
            }
        }
        return list;
    }
}