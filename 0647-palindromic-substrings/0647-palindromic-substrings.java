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
    int count=0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
             
                if(palindromecheck(i,j,s)){
                    count++;
                }
            }
        }
        return count;
    }
}