class Solution {
    public String reverseWords(String s) {
    s= s.trim();
   
     
      String[] sp= s.split("\\s+");
      StringBuilder sb2 = new StringBuilder();
      
       for(int i=sp.length-1;i>=0;i--){
        sb2.append(sp[i]);
        if(i!=0)
        sb2.append(" ");
       }
    
       return sb2.toString();
    }
}