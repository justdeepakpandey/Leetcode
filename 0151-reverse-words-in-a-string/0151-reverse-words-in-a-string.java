class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] ans=s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=ans.length-1;i>=1;i--){
             sb.append(ans[i]+" ");
            
        }
         sb.append(ans[0]);
         return sb.toString();
        
    }
}