class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(j<arr.length){
            set.add(arr[j]-arr[i]);
            j++;
            i++;
        }
        if(set.size()==1){
            return true;
        }
        return false;
    }
}