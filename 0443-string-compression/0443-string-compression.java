class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        StringBuilder sb= new StringBuilder();
        int j=0;
        int c=1;
        int i=1;
       while(i<chars.length){
            if(chars[j]==chars[i]){
              c++;
              i++;

            }
            else{
                sb.append(chars[j]);
                if(c>1){
                    sb.append(c);
                }
                j=i;
                i++;
                c=1;
            }
       }
        sb.append(chars[j]);

        if (c > 1) {
            sb.append(c);
        }
          for(int k = 0; k < sb.length(); k++){
            chars[k] = sb.charAt(k);
        }
      return sb.length();
    
    }
}