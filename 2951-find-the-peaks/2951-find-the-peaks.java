class Solution {
    public List<Integer> findPeaks(int[] m) {
        ArrayList<Integer> list= new ArrayList<>();
        int i=0;
        int j=i+1;
        int k=j+1;
        while(i<m.length&&j<m.length&&k<m.length){
            if(m[j]>m[i]&&m[j]>m[k]){
                list.add(j);
            }
            i++;
            j++;
            k++;
        }
     return list;
    }
}