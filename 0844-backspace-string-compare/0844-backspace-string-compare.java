class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);

            if (c1 == '#') {
                if (sb1.length() > 0) {
                    sb1.deleteCharAt(sb1.length() - 1);
                }
            } else {
                sb1.append(c1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char c2 = t.charAt(i);

            if (c2 == '#') {
                if (sb2.length() > 0) {
                    sb2.deleteCharAt(sb2.length() - 1);
                }
            } else {
                sb2.append(c2);
            }
        }

        if (sb1.toString().equals(sb2.toString())) {
            return true;
        }

        return false;
    }
}