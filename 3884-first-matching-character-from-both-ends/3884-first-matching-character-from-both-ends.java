class Solution {
    public int firstMatchingIndex(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char ch=s.charAt(i);
            char chh=s.charAt(j);
            if(ch==chh){
                return i;
            }
            i++;
            j--;
        }
        return -1;
    }
}