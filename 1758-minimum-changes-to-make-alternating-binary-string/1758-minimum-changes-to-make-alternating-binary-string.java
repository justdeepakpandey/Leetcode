class Solution {
    public int minOperations(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            list.add(ch-'0');
        }
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list2.add(0);
            list2.add(1);
        }
        for(int i=0;i<list.size();i++){
            list3.add(1);
            list3.add(0);
        }
        int count1=0;
        int count2=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)!=list2.get(i)){
                count1++;
            }
        }
         for(int i=0;i<list.size();i++){
            if(list.get(i)!=list3.get(i)){
                count2++;
            }
        }
        return Math.min(count1,count2);
      
    }
}