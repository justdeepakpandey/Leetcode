class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(int i:map.values()){
            if(i%2==0){
                count=count+2;
            }else{
                count=count+1;
            }
        }
        return count;
    }
}