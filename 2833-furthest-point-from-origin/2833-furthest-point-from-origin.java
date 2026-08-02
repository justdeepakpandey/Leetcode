class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        StringBuilder sb = new StringBuilder();
        int l=0;
        int r=0;
        int s=0;
        for(int i=0;i<moves.length();i++){
            char ch= moves.charAt(i);
            if(ch=='L'){
                l++;
            }else if(ch=='R'){
                r++;
            }else if(ch=='_'){
                s++;
            }

        }
        if(s==moves.length()){
            return moves.length();
        }
       if(l==r){
        return s;
       }
       if(l>r){
        return s+l-r;
       }
       if(r>l){
        return r+s-l;
       }
        
         return -1;  

    }
}