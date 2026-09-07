class Solution {
    public int mirrorFrequency(String s) {
       int[] freq1= new int[26];
       int[] freq2=new int[10];
       for(int i=0;i<s.length();i++){
        if(Character.isLetter(s.charAt(i))){
            freq1[s.charAt(i)-'a']++;
        }
        else if(Character.isDigit(s.charAt(i))){
            freq2[s.charAt(i)-'0']++;
        }
       }
       int i=0;
       int j=freq1.length-1;
       ArrayList<Integer> list = new ArrayList<>();
       while(i<j){
        int s1=Math.abs(freq1[i]-freq1[j]);
        list.add(s1);
        i++;
        j--;

       }
       int a=0;
       int b=freq2.length-1;
       while(a<b){
        int s2=Math.abs(freq2[a]-freq2[b]);
        list.add(s2);
        a++;
        b--;
     
       }
       int sum=0;
       for(int z:list){
        sum+=z;
       }
       return sum;
    }
}