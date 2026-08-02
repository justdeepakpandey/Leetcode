class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int l=0;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='|'){
                l++;
             }
             if(l%2==0){
                if(s.charAt(i)=='*'){
                    count++;
                }
             }
        }
        return count;
    }
}