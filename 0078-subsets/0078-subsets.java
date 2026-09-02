class Solution {
    public List<List<Integer>> Subset(int[] nums,List<List<Integer>> result,ArrayList<Integer> list,int start){
           result.add(new ArrayList<>(list));
           for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            Subset(nums,result,list,i+1);
            list.remove(list.size()-1);
           }
           return result;
    }
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> result= new ArrayList<>();
          Subset(nums,result,new ArrayList<>(),0);
          return result;
    }
}