class Solution {
    public boolean digitCount(String num) {
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=0;i<num.length();i++){
        list.add(num.charAt(i)-'0');
      }
      HashMap<Integer,Integer> map= new HashMap<>();
      for(int i=0;i<list.size();i++){
        int temp=list.get(i);
        map.put(temp,map.getOrDefault(temp,0)+1);
      }
      HashMap<Integer,Integer> map2= new HashMap<>();
      for(int i=0;i<list.size();i++){
        map2.put(i,list.get(i));
      }
      for(int  i:map.keySet()){
        if(map.get(i)!=map2.get(i)){
            return false;
        }
      }
      return true;
    }
}