class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!=ch){
                sb.append(word.charAt(i));
            }else{
                sb.append(word.charAt(i));
                 sb.reverse();
                break;
              
            }
            
        }
         
            for(int i=sb.length();i<word.length();i++){
                sb.append(word.charAt(i));
            }
        
        return sb.toString();
    }
}