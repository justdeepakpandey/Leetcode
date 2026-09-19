class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                list.add(nums[i]);
            }else{
                list2.add(nums[i]);
            }
        }
        int n =list.size()+list2.size();
        int[] arr = new int[n];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        int k=list.size();
        for(int i=0;i<list2.size();i++){
            arr[k]=list2.get(i);
            k++;
        }
        return arr;
    }
}