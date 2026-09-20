class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer> map= new HashMap<>();
     ArrayList<Integer> list= new ArrayList<>();
    
     int[] arr = new int[k];

     for(int i=0;i<nums.length;i++){
        int a=nums[i];
        map.put(a,map.getOrDefault(a,0)+1);
     }  
     for(int i:map.keySet()){
        list.add(i);
     }
     list.sort((a, b) -> map.get(b) - map.get(a));
     int j=0;
     for(int i:list){
        if(j<k){
        arr[j]=i;
        j++;
        }
     }
     return arr;

    }
}