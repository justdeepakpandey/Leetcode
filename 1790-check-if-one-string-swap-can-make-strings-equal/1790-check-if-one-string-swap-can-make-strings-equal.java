class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i=0;
        int j=0;
        int count=0;
          HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();

        for(int k=0;k<s1.length();k++){
            char ch=s1.charAt(k);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
         for(int k=0;k<s2.length();k++){
            char ch=s2.charAt(k);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
      if(map1.equals(map2)==false){
        return false;
      }
        
        while(i<s1.length()&&j<s2.length()){
            if(s1.charAt(i)!=s2.charAt(j)){
                count++;
            }
            i++;
            j++;
        }
        if(count<=2){
            return true;
        }
        return false;
    }
}