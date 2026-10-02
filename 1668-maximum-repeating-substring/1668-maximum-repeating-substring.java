class Solution {
    public int maxRepeating(String seq, String word) {
        StringBuilder sb = new StringBuilder();
        int count=0;
        while(seq.contains(sb.append(word).toString())){
            count++;
        }
        return count;
    }
}