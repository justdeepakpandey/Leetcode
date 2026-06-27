class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     
         int t =target-'a';
         int [] alpha=new int[letters.length];
        for(int i=0;i<letters.length;i++){
            alpha[i]=letters[i]-'a';   
        }
        int j=0;
        for(int i=0;i<letters.length;i++){
            if(alpha[i]>t){
             j=i;
                break;
            }
        }
        return letters[j];

    }
}