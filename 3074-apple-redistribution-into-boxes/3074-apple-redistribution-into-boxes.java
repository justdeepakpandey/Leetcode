class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum1=0;
        for(int i=0;i<apple.length;i++){
            sum1+=apple[i];
        }
        Arrays.sort(capacity);
        int count=0;
        int sum2=0;
        for(int i=capacity.length-1;i>=0;i--){
            sum2+=capacity[i];
            count++;
            if(sum2>=sum1){
                return count;
            }
        }
        return -1;
    }
}