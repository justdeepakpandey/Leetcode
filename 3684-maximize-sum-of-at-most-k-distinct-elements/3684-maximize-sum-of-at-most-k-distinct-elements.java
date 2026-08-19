class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:set){
            list.add(i);
        } 
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();
        int x=0;
        for(int i=list.size()-1;i>=0;i--){
            if(x>=k){
                break;
            }
            ans.add(list.get(i));
            x++;
        }
        int[] arr=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            arr[i]=ans.get(i);
        }
        return arr;
    }
}