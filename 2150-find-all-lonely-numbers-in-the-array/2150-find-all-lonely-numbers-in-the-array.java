class Solution {
    public List<Integer> findLonely(int[] nums) {
       
ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a= nums[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
       for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i]+1)&&(!map.containsKey(nums[i]-1)&&map.get(nums[i])==1)){
            list.add(nums[i]);
        }
       }
       return list;
    }
}