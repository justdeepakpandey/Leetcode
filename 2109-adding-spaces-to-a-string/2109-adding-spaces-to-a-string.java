class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(i<s.length()&&j<spaces.length){
            if(spaces[j]==i){
                sb.append(' ');
                sb.append(s.charAt(i));
                j++;
                i++;
                
            }
            else{
            sb.append(s.charAt(i));
            i++;
            }
           
        }
         while(i<s.length()){
                sb.append(s.charAt(i));
                i++;
            }
        return sb.toString();
    }
}