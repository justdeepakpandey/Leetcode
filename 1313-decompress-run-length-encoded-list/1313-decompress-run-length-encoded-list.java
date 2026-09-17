class Solution {
    public int[] decompressRLElist(int[] nums) {
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<nums.length;i=i+2){
            int c=nums[j];
            while(c>0){
                list.add(nums[i]);
                c--;
            }
            j=j+2;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}