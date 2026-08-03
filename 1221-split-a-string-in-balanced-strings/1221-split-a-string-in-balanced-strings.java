class Solution {
    public int balancedStringSplit(String s) {
        int cl=0;
        int cr=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                cr++;
            }else if(s.charAt(i)=='L'){
                cl++;
            }
            if(cl==cr){
              count++;
              cl=0;
              cr=0;
            }
        }
        return count;
    }
}