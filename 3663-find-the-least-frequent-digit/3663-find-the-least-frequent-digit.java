class Solution {
    public int getLeastFrequentDigit(int n) {
        ArrayList<Integer> list = new ArrayList<>();
      while(n>0){
        int digit=n%10;
        list.add(digit);
        n=n/10;
      }
     
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<list.size();i++){
        int a=list.get(i);
        map.put(a,map.getOrDefault(a,0)+1);
      }
      int min=Integer.MAX_VALUE;
      for(int i:map.values()){
         min=Math.min(i,min);
      }
     int ans=Integer.MAX_VALUE;
     for(int digit:map.keySet()){
        if(map.get(digit)==min){
            ans=Math.min(ans,digit);
        }
     }
     return ans;

    }
}