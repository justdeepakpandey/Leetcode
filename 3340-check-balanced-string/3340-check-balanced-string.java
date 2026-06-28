class Solution {
    public boolean isBalanced(String num) {
      char [] arr =num.toCharArray();
      int ei=0;
      int oi=0;
      for(int i=0;i<arr.length;i++){
        if(i%2==0){
            ei=ei+arr[i]-'0';
        }else{
            oi=oi+arr[i]-'0';
        }
      }
      
      return ei==oi;

    }
}