class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        list.add(nums[i]);
       }
       ArrayList<Integer> list2= new ArrayList<>();
     for(int i=nums[0]+1;i<=nums[nums.length-1]-1;i++){
        if(!list.contains(i)){
            list2.add(i);
        }
     }
     Collections.sort(list2);
     return list2;
    }
}