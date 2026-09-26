class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        int n=nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i=(nums.length)*2-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty()&&st.peek()<=nums[idx]){
                st.pop();
            }
            if(!st.isEmpty()&&i<nums.length){
                arr[idx]=st.peek();
            }
            st.push(nums[idx]);
        }
        return arr;
    }
}