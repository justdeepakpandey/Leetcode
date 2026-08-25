class Solution {
    public String reverseByType(String s) {
        int i=0;
        int j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(i<j){
           
            while(i<j&&!Character.isLetter(sb.charAt(i))){
               i++;
            }
            while(i<j&&!Character.isLetter(sb.charAt(j))){
                j--;
            }
            if(i<j){
                char temp=sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,temp);
                i++;
            j--;
           
            }
           
        }
        int x=0;
        int y=sb.length()-1;
        while(x<y){
            
            while(x<y&&Character.isLetter(sb.charAt(x))){
                x++;
            }
            while(x<y&&Character.isLetter(sb.charAt(y))){
                y--;
            }
            if(x<y){
                char temp=sb.charAt(x);
                sb.setCharAt(x,sb.charAt(y));
                sb.setCharAt(y,temp);
                 x++;
            y--;
         
            }
         
        }
        return sb.toString();
    }
}