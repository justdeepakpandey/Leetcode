class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> list= new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<digits.length;i++){
            int a=digits[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
    for(int i=100;i<999;i++){
        if(i%2==0){
            int temp=i;
            HashMap<Integer,Integer> map2= new HashMap<>();
            while(temp>0){
                int digit=temp%10;
                map2.put(digit,map2.getOrDefault(digit,0)+1);
                temp=temp/10;
            }
            boolean possible= true;
        for(int test:map2.keySet()){
            if(!map.containsKey(test)||map2.get(test)>map.get(test)){
                possible=false;
               break;

            }
        }
        if(possible){
            list.add(i);
        }
         
        }else{
            continue;
        }
    }
    Collections.sort(list);
    int [] arr=new int[list.size()];
    for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
    }
    return arr;
    }
}