class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        int ans=0;
        if(list.size()<=1){
            return list.get(0);
        }
       return list.get(k-1);
    }
}