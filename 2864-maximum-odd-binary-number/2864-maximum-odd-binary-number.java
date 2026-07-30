class Solution {
    public String maximumOddBinaryNumber(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
          char ch =s.charAt(i);
          list.add(ch);
        }
        Collections.sort(list);
        Collections.reverse(list);
        int i=list.size()-1;
        int j=list.size()-1;
        while(j>=0){
          if(list.get(j)=='1'){
            char temp=list.get(j);
            list.set(j,list.get(i));
            list.set(i,temp);
            break;
          }
          j--;

        }
        StringBuilder sb = new StringBuilder();
        for(int k=0;k<list.size();k++){
          sb.append(list.get(k));

        }
        return sb.toString();
    }
}