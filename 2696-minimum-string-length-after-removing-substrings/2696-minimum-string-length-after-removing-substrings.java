class Solution {
    public int minLength(String s) {
        Stack <Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(!st.isEmpty()&&st.peek()=='B'&&s.charAt(i)=='A'){
                st.pop();
                
            } else if(!st.isEmpty()&&st.peek()=='D'&&s.charAt(i)=='C'){
                st.pop();
                
            }else{
                st.push(s.charAt(i));
            }

        }
        return st.size();
    }
}