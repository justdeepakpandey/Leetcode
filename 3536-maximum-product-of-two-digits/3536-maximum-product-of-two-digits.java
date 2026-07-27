class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
             int digit=n%10;
             list.add(digit);
             n=n/10;
        }
        Collections.sort(list);
        int i=list.size()-1;
        int j =list.size()-2;
        int m =list.get(i)*list.get(j);
        return m;
    }
}