class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        while(list.contains(original)){
           
                original=original*2;
            
        }
        return original;
    }
}