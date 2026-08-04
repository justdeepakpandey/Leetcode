class Solution {
    public int maxFreqSum(String s) {
        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                map1.put(ch,map1.getOrDefault(ch,0)+1);

            }else{
                map2.put(ch,map2.getOrDefault(ch,0)+1);
            }
        }
        int max1=0;
        int max2=0;
        for(int i:map1.values()){
            if(i>max1){
                max1=i;
            }
        }
         for(int j:map2.values()){
            if(j>max2){
                max2=j;
            }
        }
            return max1+max2;
    }
}