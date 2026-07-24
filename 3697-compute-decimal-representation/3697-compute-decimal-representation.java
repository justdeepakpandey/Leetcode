class Solution {
    public int[] decimalRepresentation(int n) {
        int place=1;
        ArrayList<Integer> list= new ArrayList<>();
        while(n>0){
            int digit=n%10;
            if(digit!=0){
                list.add(digit*place);
            }
           place= place*10;
            n=n/10;   
        }
      Collections.reverse(list);
      int [] arr= new int[list.size()];
      int k=0;
      for(int i: list){
        arr[k]=i;
        k++;
      }
      return arr;
    }
}