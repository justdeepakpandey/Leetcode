class Solution {
    public String smallestPalindrome(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder left = new StringBuilder();
        StringBuilder mid = new StringBuilder();

        int i = 0;

        while (i < arr.length) {

            if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                left.append(arr[i]);
                i += 2;
            } else {
                mid.append(arr[i]);
                i++;
            }
        }

        StringBuilder ans = new StringBuilder();

        ans.append(left);
        ans.append(mid);
        ans.append(new StringBuilder(left).reverse());

        return ans.toString();
    }
}