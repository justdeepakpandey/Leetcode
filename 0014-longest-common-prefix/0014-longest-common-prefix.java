class Solution {
    public String longestCommonPrefix(String[] strs) {
         if(strs.length==0||strs==null){
            return "";
         }
         Arrays.sort(strs);
         int i=0;
         int count=0;
         String str1 =strs[0];
         String str2=strs[strs.length-1];
         while(i<str1.length()&&i<str2.length()){
            if(str1.charAt(i)==str2.charAt(i)){
                  i++;
            }else{
                break;
            }
         }
         return str1.substring(0,i);
    }
}