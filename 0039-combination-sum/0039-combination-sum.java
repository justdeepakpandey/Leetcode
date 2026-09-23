class Solution {
    public void combinations(int[] candidates,int target,List<List<Integer>> ans,ArrayList<Integer> list,int i){
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[i]<=target){
            list.add(candidates[i]);
           
            combinations(candidates,target-candidates[i],ans,list,i);
            list.remove(list.size()-1);
        }
          combinations(candidates,target,ans,list,i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        combinations(candidates,target,ans,list,0);
        return ans;
    }
}