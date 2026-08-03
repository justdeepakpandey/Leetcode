class Solution {
    public int alternateDigitSum(int n) {
        StringBuilder sb = new StringBuilder();
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
         while(rev>0){
            int digit=rev%10;
            sb.append(digit+",");
            rev=rev/10;
         }
         String[] arr= sb.toString().split(",");
         int evensum=0;
         int oddsum=0;
         for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evensum+=Integer.parseInt(arr[i]);

            }else{
            oddsum+=Integer.parseInt(arr[i]);
            }
         }
         return evensum-oddsum;
    }
}