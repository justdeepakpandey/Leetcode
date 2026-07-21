class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int ans =-1;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>=0;j--){
                if(s.charAt(i)==s.charAt(j)){
                    ans=j-i-1;

                }
                max=Math.max(max,ans);
            }
        }
        return max;
    }
}