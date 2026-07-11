class Solution {
    public int mostWordsFound(String[] sentences) {
        StringBuilder sb = new StringBuilder();
        int count =0;
        int max=0;
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<sentences.length;i++){
            sb.append(sentences[i]).append(',');
            
        }
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch==' '){
                count=count+1;
                max=Math.max(count,max);
            }else if(ch==','){
                count=0;
            }
        }
        return max+1;
    }
}