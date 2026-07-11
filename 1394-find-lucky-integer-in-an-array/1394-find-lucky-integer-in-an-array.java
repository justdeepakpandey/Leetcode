class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int max=-1;
        for(int i=0;i<arr.length;i++){
            int n = arr[i];
            map.put(n,map.getOrDefault(n,0)+1);
        }
       for (int key : map.keySet()) {
    if (key == map.get(key)) {
       list.add(key);
    }
}
for(int i=0;i<list.size();i++){
       max= Math.max(max,list.get(i));


        }
        if(list.size()==0){
            return -1;
        }
        return max;
    }
}