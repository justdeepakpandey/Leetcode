class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }
        int [] ans = new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            ans[i]=ch-'0';
        }
        return ans;
    }
}