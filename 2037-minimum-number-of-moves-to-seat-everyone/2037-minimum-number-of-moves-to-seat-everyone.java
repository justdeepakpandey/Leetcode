class Solution {
    public int minMovesToSeat(int[] se, int[] st) {
        Arrays.sort(se);
        Arrays.sort(st);
        int count=0;
        int i=0;int j=0;
        while(i<se.length&&j<st.length){
                count=count+Math.abs(se[i]-st[j]);
                i++;
                j++;
        }
        return count;
    }
}