class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int d =nums[i];
            map.put(d,map.getOrDefault(d,0)+1);
        }
       for(int i=0;i<nums.length;i++){
           if(map.get(nums[i])>1){
            continue;
           }else if( map.containsKey(nums[i]+1)||map.containsKey(nums[i]-1)){
            continue;
           }
           list.add(nums[i]);
       }
       return list;
    }
}