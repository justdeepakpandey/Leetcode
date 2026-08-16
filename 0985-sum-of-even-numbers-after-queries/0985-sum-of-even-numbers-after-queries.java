class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < queries[i].length; j++) {
                list.add(queries[i][j]);
            }
        }

        int[] ans = new int[queries.length];

        int i = 0;
        int j = 1;

        while (j < list.size()) {

            int k = list.get(j);  // index
            int l = list.get(i);  // value

            nums[k] = nums[k] + l;

            int sum = 0;

            for (int x = 0; x < nums.length; x++) {
                if (nums[x] % 2 == 0) {
                    sum += nums[x];
                }
            }

            ans[i / 2] = sum;

            i += 2;
            j += 2;
        }

        return ans;
    }
}