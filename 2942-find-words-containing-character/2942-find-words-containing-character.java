class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
          for(int j=0;j<sb.length();j++){
            if(sb.charAt(j)==x){
                list.add(i);
                break;
            }
          }   
        }
        
        return list;
    }
}