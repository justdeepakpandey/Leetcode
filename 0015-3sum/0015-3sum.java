import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values of i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int a = i + 1;
            int b = nums.length - 1;

            while (a < b) {

                int sum = nums[i] + nums[a] + nums[b];

                if (sum == 0) {

                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[a]);
                    temp.add(nums[b]);

                    ans.add(temp);

                    a++;
                    b--;

                    // Skip duplicate values of a
                    while (a < b && nums[a] == nums[a - 1]) {
                        a++;
                    }

                    // Skip duplicate values of b
                    while (a < b && nums[b] == nums[b + 1]) {
                        b--;
                    }

                } else if (sum < 0) {
                    a++;
                } else {
                    b--;
                }
            }
        }

        return ans;
    }
}