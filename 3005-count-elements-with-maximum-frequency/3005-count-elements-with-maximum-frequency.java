class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            map.put(a,map.getOrDefault(a,0)+1);

        }
        int max=Integer.MIN_VALUE;
        for(int i:map.values()){
            if(i>max){
                max=i;
            }
        }
        int sum=0;
        for(int i:map.values()){
            if(i==max){
                sum+=i;
            }
        }
return sum;
    }
}