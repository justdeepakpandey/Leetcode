class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        int c1=0;
        int c2=0;
        int n = s.length()/2;
        for(int i=0;i<s.length();i++){
            if(i<n){
                sb1.append(s.charAt(i));
            }else{
                sb2.append(s.charAt(i));
            }
        }
        for(int i=0;i<sb1.length();i++){
            char ch = sb1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                c1++;
            }
        }
         for(int i=0;i<sb2.length();i++){
            char c = sb2.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                c2++;
            }
        }
        if(c1==c2){
            return true;
        }
        return false;

    }
}