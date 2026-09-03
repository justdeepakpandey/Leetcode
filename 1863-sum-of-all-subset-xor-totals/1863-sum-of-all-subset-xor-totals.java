class Solution {
    int sum=0;
    public void subset(int[] nums,ArrayList<Integer> list,int start){
     
        int xor=0;
        for(int num:list){
            xor^=num;
        }
        sum+=xor;
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            subset(nums,list,i+1);
            list.remove(list.size()-1);
        }
     

    }
    public int subsetXORSum(int[] nums) {
        sum=0;
     ArrayList<Integer> list= new ArrayList<>();
        subset(nums,list,0);
        return sum;
    }
}