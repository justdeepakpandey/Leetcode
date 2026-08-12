class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr= new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        int k=nums.length;
        for(int i=0;i<nums.length;i++){
            arr[k]=nums[i];
            k++;
        }
        return arr;
    }
}