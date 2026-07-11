class Solution {
    public long countSubstrings(String s, char c) {
        long m=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                m++;
            }
        }
        return  (long)m*(m+1)/2;
    }
}