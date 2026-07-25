class Solution {
    public int maxIceCream(int[] cost, int coins) {
        Arrays.sort(cost);
        int count=0;
        for(int i=0;i<cost.length;i++){
            if(coins>=cost[i]){
                count++;
                coins=coins-cost[i];
            }
        }
        return count;
    }
}