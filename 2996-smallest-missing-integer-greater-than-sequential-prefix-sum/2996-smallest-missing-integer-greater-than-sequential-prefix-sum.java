class Solution {
    public int missingInteger(int[] nums) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list1.add(nums[i]);


        }
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
               if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
               }else{
                break;
               }
        }
        while(list1.contains(sum)){
           sum++;
        }
       
return sum;
    }
}