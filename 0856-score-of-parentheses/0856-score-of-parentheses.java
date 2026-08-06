class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int max= Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                 st.push(0);
            }
            else {
                int val= st.pop();
                int score=Math.max(2*val,1);
                st.push(score + st.pop());

            }
        }
        return st.peek();
    }
}