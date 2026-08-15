class Solution {
    public int maxVowels(String s, int k) {
        int c=0; 
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }

        }
        int max=c;
        for(int i=k;i<s.length();i++){
        
            char r =s.charAt(i-k);
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
            if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'){
                c--;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}