class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int [] arr = new int[nums2.length];
        for(int i=0;i<nums2.length;i++){
            arr[i]=nums2[i]*k;
        }
       
        int count=0;
      for(int i=0;i<nums1.length;i++){
        for(int j=0;j<arr.length;j++){
            if(nums1[i]%arr[j]==0){
                count++;
            }
        }
      }
        return count;
    }
}