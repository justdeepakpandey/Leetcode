class Solution {
    public boolean checkInclusion(String s1, String s2) {
       
        if(s1.length()>s2.length()){
            return false;
        }
     HashMap<Character,Integer> map1= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);


        }
        for(int i=0;i<s2.length();i++){
             HashMap<Character,Integer> map2= new HashMap<>();
            for(int j=i;j<s2.length();j++){
            char c=s2.charAt(j);
             map2.put(c,map2.getOrDefault(c,0)+1);
             if(j-i+1==s1.length()){
                if(map1.equals(map2)){
                    return true;
                }
             }
             if(map2.size()>map1.size()){
                break;
             }

            }
        }
        return false;
    }
}