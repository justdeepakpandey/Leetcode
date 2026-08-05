class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st= new Stack<>();
        int n= nums.length;
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        for(int i=nums.length*2-1;i>=0;i--){
            int num=i%n;
            while(!st.isEmpty()&&st.peek()<=nums[num]){
                st.pop();
            }
            if(!st.isEmpty()&&i<nums.length){
                arr[num]=st.peek();
            }
            st.push(nums[num]);
        }
        return arr;
    }
}