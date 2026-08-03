class Solution {
    public int minimumSum(int num) {
 ArrayList<Integer> list = new ArrayList<>();
        while(num>0){
            int digit = num%10;
            list.add(digit);
            num=num/10;
        }
       
       
        Collections.sort(list);
       int sum1=list.get(0)*10+list.get(list.size()-1);
       int sum2=list.get(1)*10+list.get(list.size()-2);
       return sum1+sum2;
    }
}