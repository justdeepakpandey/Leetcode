class Solution {
    public boolean judgeCircle(String s) {
        int u=0;
        int d=0;
        int l=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                u++;
            }
             if(s.charAt(i)=='D'){
                d++;
            }
            if(s.charAt(i)=='L'){
                l++;
            }
            if(s.charAt(i)=='R'){
                r++;
            }
        }
        if(l==r && u==d){
            return true;
            
        }
        if(l!=r){
            return false;
        }
        if(u!=d){
            return false;
        }
        return true;
    }
}