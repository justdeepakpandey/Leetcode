class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums){
             pq.add(i);
        }
        for(int i=0;i<k;i++){
            ans=pq.poll();
        }
       
        return ans;
       
    }
}