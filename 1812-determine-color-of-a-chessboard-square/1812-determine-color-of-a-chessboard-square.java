class Solution {
    public boolean squareIsWhite(String c) {
        for(int i=0;i<c.length();i++){
            char ch = c.charAt(i);
            if(ch=='a'||ch=='c'||ch=='e'||ch=='g'){
                if(c.charAt(i+1)%2==0){
                    return true;
                }else {
                    return false;
                }
            }else if(ch=='b'||ch=='d'||ch=='f'||ch=='h'){
                if(c.charAt(i+1)%2==0){
                    return false;
                }else {
                    return true;
                }
            }
        }
        return true;
    }
}