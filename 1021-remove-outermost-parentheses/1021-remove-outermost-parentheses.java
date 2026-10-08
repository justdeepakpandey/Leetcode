class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int d=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='('){
            if(d>0){
                sb.append('(');
            }
            d++;
          }
          if(s.charAt(i)==')'){
              d--;
            if(d>0){
                sb.append(')');
            }
            
          }
        
        }
        return sb.toString();
    }
}