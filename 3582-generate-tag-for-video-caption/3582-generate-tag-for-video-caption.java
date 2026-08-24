class Solution {
    public String generateTag(String c) {
        StringBuilder sb = new StringBuilder();
        c=c.trim();
        sb.append('#');
        String[] arr=c.split("\\s+");
        for(int i=0;i<arr.length-1;i++){
            sb.append(arr[i]);
            sb.append(',');
        }

        sb.append(arr[arr.length-1]);
        StringBuilder ans = new StringBuilder();
        ans.append(sb.charAt(0));
        for(int i=1;i<sb.length();i++){
            
            if(sb.charAt(i-1)=='#'){
                ans.append(Character.toLowerCase(sb.charAt(i)));

            }else if(sb.charAt(i)==','){
                continue;
            }else if(sb.charAt(i-1)==','){
                ans.append(Character.toUpperCase(sb.charAt(i)));
            }else{
                ans.append(Character.toLowerCase(sb.charAt(i)));
            }
            int j=ans.length()-1;
           while(ans.length()>100){
               ans.deleteCharAt(j);
               j--;

           }

        }
        return ans.toString();
    }
}