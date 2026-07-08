class Solution {
    public long sumAndMultiply(int n) {

        StringBuilder sb = new StringBuilder(String.valueOf(n));
        StringBuilder sb1 = new StringBuilder();

        int sum = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '0') {
                sb1.append(sb.charAt(i));
            }
        }

        for (int i = 0; i < sb1.length(); i++) {
            sum += sb1.charAt(i) - '0';
        }

        if (sb1.length() == 0) return 0;

        long num = Long.parseLong(sb1.toString());

        return num * sum;
    }
}