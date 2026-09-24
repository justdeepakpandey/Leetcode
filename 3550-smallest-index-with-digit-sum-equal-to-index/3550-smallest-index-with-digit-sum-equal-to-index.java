class Solution {
    public int smallestIndex(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
          map.put(i,nums[i]);
        }
        for(int i:map.keySet()){
          int n =map.get(i);
          int temp=n;
          int sum=0;
          while(temp>0){
            int digit=temp%10;
            sum+=digit;
            temp=temp/10;
          }
          if(sum==i){
            return i;
          }
        }
        return -1;
        
    }
    
    }
