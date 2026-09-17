class Solution {
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        int c=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='D'){
            arr[i]=n;
            n=n-1;
           }
           else if(s.charAt(i)=='I'){
            arr[i]=c;
            c=c+1;
           }
        }
        if(s.length()-1=='D'){
            arr[arr.length-1]=c;
        }else{
            arr[arr.length-1]=n;
        }
        return arr;
    }
}