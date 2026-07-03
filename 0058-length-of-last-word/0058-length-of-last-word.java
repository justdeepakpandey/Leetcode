class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch =s.charAt(i);
            if(ch!=' '){
                sb.append(s.charAt(i));
            
            }else if(ch==' '){
                break;
            }
            
        }
        return sb.length();
        
    }
}