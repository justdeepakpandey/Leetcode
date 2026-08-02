class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n= nums.length;
        int[] arr = new int[n];
        for(int i=0;i<nums.length;i++){
            int a=nums[i]%n;
            int newi=(i+a)%n;
            if(newi<0){
                newi+=n;
            }
            arr[i]=nums[newi];
        } 
        return arr;
    }
}