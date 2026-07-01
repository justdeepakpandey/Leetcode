class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder sb = new StringBuilder ();
       StringBuilder sb1 = new StringBuilder ();
       for(int i=0;i<word1.length;i++){
        sb.append(word1[i]);
       }
       for(int i=0;i<word2.length;i++){
        sb1.append(word2[i]);
       }
       int[] ans1=new int[sb.length()];
       for(int i=0;i<sb.length();i++){
           ans1[i]=sb.charAt(i);
       }
       int [] ans2=new int[sb1.length()];
       for(int i=0;i<sb1.length();i++){
           ans2[i]=sb1.charAt(i);
       }
       if(ans1.length!=ans2.length){
        return false;
        
       }
       int i=0;
       int j=0;
       while(i<ans1.length&&j<ans2.length){
        if(ans1[i]!=ans2[j]){
            return false;
        }
        i++;
        j++;
       }
       
       return true;
    }
}