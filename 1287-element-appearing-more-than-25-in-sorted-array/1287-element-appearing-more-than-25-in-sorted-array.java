class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int a=arr[i];
            map.put(a,map.getOrDefault(a,0)+1);

        }
        int n=arr.length;
        for(int i:map.keySet()){
            if(map.get(i)>(n)*25/100){
                return i;
            }
           
        }
        return -1;
    }
}