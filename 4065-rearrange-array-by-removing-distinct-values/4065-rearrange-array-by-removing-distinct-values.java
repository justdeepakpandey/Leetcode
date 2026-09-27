class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
         
        while(!map.isEmpty()){
                 ArrayList<Integer> keys = new ArrayList<>(map.keySet());
                 Collections.sort(keys);
            for(int i:keys){
                list.add(i);
            
            if(map.get(i)==1){
                map.remove(i);
            }else{
                map.put(i,map.get(i)-1);
            }
            }

        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}