class Solution {
    public boolean isPalindrome(String s) {
        s=s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
      String a=sb.toString();
      String rev = sb.reverse().toString();
      return a.equals(rev);
     
    

    }
}