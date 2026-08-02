class Solution {
    public int romanToInt(String s) {
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='I'){
                sb.append(1+" ");
            }else if(ch=='V'){
                sb.append(5+" ");
            }else if(ch=='X'){
                sb.append(10+" ");
            }else if(ch=='L'){
                sb.append(50+" ");
            }else if(ch=='C'){
                sb.append(100+" ");

            }else if(ch=='D'){
                sb.append(500+" ");
            }else {
                sb.append(1000+" ");
            }
         }
         String z =sb.toString();
         String[] arr= z.split(" ");
         int sum=0;
         for(int i=0;i<arr.length-1;i++){
             int curr = Integer.parseInt(arr[i]);
              int next = Integer.parseInt(arr[i + 1]);
 
          if (curr >= next) {
        sum += curr;
             } else {
        sum -= curr;
       }
         }
        int last=Integer.parseInt(arr[arr.length-1]);
        sum+=last;
         return sum;
    }
}