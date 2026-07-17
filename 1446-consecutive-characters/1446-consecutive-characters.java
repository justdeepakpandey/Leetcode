class Solution {
    public int maxPower(String s) {
        int c=1;
        int max=1;
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }else{
                c=1;
            }
            max=Math.max(c,max);
        }
       return max;
    }
}