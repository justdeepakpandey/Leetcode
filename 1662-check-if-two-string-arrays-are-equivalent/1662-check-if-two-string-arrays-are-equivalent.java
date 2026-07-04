class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
       
        for(int i=0;i<word1.length;i++){
            sb1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            sb2.append(word2[i]);
        }
        if(sb1.length()!=sb2.length()){
            return false;
        }
      int i=0;
      int j=0;
      while(i<sb1.length()&&j<sb2.length()){
        if(sb1.charAt(i)!=sb2.charAt(j)){
            return false;

        }else {
            i++;
            j++;
         
        }
       
       
      }  
      return true;
      
    }
}