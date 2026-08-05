class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st= new Stack<>();
        Stack<Character> st2= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty()&&s.charAt(i)=='#'){
                st.pop();
            }else{
                 if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
                 }
            }
        }
         for(int j=0;j<t.length();j++){
            if(!st2.isEmpty()&&t.charAt(j)=='#'){
                st2.pop();
            }else{
                if(t.charAt(j)!='#'){
                st2.push(t.charAt(j));
                }
            }
        }
      
        return st.equals(st2);
    }
}