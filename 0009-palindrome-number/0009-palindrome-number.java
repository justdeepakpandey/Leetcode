class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        ArrayList<Integer> list= new ArrayList<>();
        while(x>0){
            int digit=x%10;
            list.add(digit);
            x=x/10;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j){
            if(list.get(i)!=list.get(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}