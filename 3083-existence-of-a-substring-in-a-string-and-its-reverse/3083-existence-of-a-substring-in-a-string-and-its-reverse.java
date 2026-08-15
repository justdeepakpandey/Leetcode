class Solution {
    public boolean isSubstringPresent(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
       int i=0;
       int j=1;
       while(j<rev.length()){
        String res="";
        res+=rev.charAt(i);
        res+=rev.charAt(j);
        if(s.contains(res)){
            return true;
        }else{
            i++;
            j++;
        }
       
      
    }
     return false;
    }
}