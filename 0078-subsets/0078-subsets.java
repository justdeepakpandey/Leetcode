class Solution {
    public void subs(int[] nums, ArrayList<Integer> current,List<List<Integer>> result,int i){
        if(i==nums.length){
            result.add(new ArrayList<Integer>(current));
            return;
        }
        current.add(nums[i]);
        subs(nums,current,result,i+1);
        current.remove(current.size()-1);
        subs(nums,current,result,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> current = new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        subs(nums,current,result,0);
        return result;

    }
}