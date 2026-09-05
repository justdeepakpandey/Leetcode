class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=arr.length/2;
        for(int i=0;i<arr.length;i++){
            int a =arr[i];
             map.put(a,map.getOrDefault(a,0)+1);            
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:map.values()){
            list.add(i);
        }
        Collections.sort(list);
        int sum=0;
        int c=0;
        for(int i=list.size()-1;i>=0;i--){
           if(sum<n){
             sum+=list.get(i);
             c++;
           }
        }
           return c;
    }
}