class Solution {
    public int mostFrequentEven(int[] nums) {
       ArrayList<Integer> list =new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            list.add(nums[i]);
        }
       }
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<list.size();i++){
        int a=list.get(i);
        map.put(a,map.getOrDefault(a,0)+1);
       }
       int max=Integer.MIN_VALUE;
       int count=0;
       int ans=0;
       for(int i:map.keySet()){
        if(map.get(i)>max){
            max=map.get(i);
            ans=i;

        }
        else if(map.get(i)==max&&ans>i){
            ans=i;

        }
       }
       if(list.size()==0){
        return -1;
       }
       return ans;
    }
}