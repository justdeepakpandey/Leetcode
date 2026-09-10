class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<ranks.length;i++){
            int a=ranks[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(int i:map.values()){
            max=Math.max(max,i);

        }
        int m=Integer.MIN_VALUE;
        HashMap<Character,Integer> map2= new HashMap<>();

        for(int i=0;i<suits.length;i++){
              char temp=suits[i];
              map2.put(temp,map2.getOrDefault(temp,0)+1);

              
        }
        for(int i:map2.values()){
            m=Math.max(m,i);
        }
          if(m==suits.length){
            m=0;
          }


        if(max==1 &&m==0 ){
            return "Flush";
        }
        if(max>=3){
            return "Three of a Kind";
        }
    if(max==2){
        return "Pair";
    }
    else{
        return "High Card";
    }
    }
}