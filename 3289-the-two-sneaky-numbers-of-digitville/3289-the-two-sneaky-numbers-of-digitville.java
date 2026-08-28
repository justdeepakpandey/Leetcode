class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            map.put(a,map.getOrDefault(a,0)+1);

        }
        int i=0;
        int[] arr = new int[2];
        for(int j:map.keySet()){
            if(map.get(j)==2){
                arr[i]=j;
                i++;
            }
        }
        return arr;
    }
}