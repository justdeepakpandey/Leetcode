class Solution {
    boolean palindromecheck(int i,int j,String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String result="";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                 if(palindromecheck(i,j,s)){
                    if(j-i+1>result.length()){
                        result=s.substring(i,j+1);
                    }
                 }
            }
        }
        return result;
    }
}