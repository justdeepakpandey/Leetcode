class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
       
        for(int i=0;i<nums.length-2;i++){
          
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int a=i+1;
            int b=nums.length-1;
            while(a<b){
                 ArrayList<Integer> list = new ArrayList<>();
                int sum=nums[i]+nums[a]+nums[b];
                if(sum==0){
                    list.add(nums[i]);
                    list.add(nums[a]);
                    list.add(nums[b]);
                     ans.add(list);
                    a++;
                    b--;
                
                while(a<b&&nums[a]==nums[a-1]){
                    a++;
                }
                while(a<b && nums[b]==nums[b+1]){
                    b--;
                }
             }else if(sum>0){
                b--;
              }else{
                a++;
              }
             
            }
        }
        return ans;
    }
}