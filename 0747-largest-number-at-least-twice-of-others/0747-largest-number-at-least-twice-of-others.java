class Solution {
    public int dominantIndex(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(max==nums[i]){
                continue;
            }
            if(max<(nums[i]*2)){
                return -1;
            }
        }
        return map.get(max);
    }
}