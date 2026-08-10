import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // sum 0 ek baar already mila hai
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];

            // check karo (sum - k) pehle mila tha ya nahi
            if(map.containsKey(sum - k)) {
                count = count + map.get(sum - k);
            }

            // current sum map me store karo
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}