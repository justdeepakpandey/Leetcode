class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character,String>map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String[] s1 = s.split(" ");
        if(s1.length!=p.length()){
            return false;
        }
        for(int i=0;i<p.length();i++){
            String l=s1[i];
            char ch =p.charAt(i);
            if(map1.containsKey(p.charAt(i)) && !map1.get(ch).equals(l)){
                return false;
            }
            if(map2.containsKey(l)&&map2.get(l)!=ch){
                return false;
            }
            map1.put(ch,l);
            map2.put(l,ch);
        }
        return true;
    }
}