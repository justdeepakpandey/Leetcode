class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        HashSet<Character> set = new HashSet<>();
       for(int i=0;i<word.length();i++){
         set.add(word.charAt(i));
       }
        StringBuilder sb = new StringBuilder();
        for(char ch:set){
          
            sb.append(ch);
        }
        sb = new StringBuilder(sb.toString().toLowerCase());
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         for(int value: map.values()){
            if(value>=2){
                count=count+1;
            }
         }
        
     return count;
    }
}