import java.util.*;

class Solution {

    public boolean isVowel(char c) {
        return c == 'A' || c == 'a' ||
               c == 'E' || c == 'e' ||
               c == 'I' || c == 'i' ||
               c == 'O' || c == 'o' ||
               c == 'U' || c == 'u';
    }

    public String sortVowels(String s) {

        ArrayList<Character> vowels = new ArrayList<>();

        // Step 1: Collect all vowels
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowels.add(s.charAt(i));
            }
        }

        // Step 2: Sort vowels
        Collections.sort(vowels);

        // Step 3: Replace vowels in sorted order
        StringBuilder sb = new StringBuilder(s);
        int idx = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (isVowel(sb.charAt(i))) {
                sb.setCharAt(i, vowels.get(idx));
                idx++;
            }
        }

        return sb.toString();
    }
}