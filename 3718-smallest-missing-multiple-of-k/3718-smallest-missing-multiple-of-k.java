class Solution {
    public int missingMultiple(int[] nums, int k) {
       
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        for(int i=1;i<Integer.MAX_VALUE;i++){
        while(!list.contains(k*i)){
            if(!list.contains(k*i)){
                return k*i;
                
            }

        }
        }
        return -1;
    }
}