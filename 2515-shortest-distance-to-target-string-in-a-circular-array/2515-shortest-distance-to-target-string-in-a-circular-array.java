class Solution {
    public int closestTarget(String[] words, String target, int si) {
        int ans=Integer.MAX_VALUE;
        int n=words.length;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int cl=(i-si+n)%n;
                int acl=(si-i+n)%n;
                ans= Math.min(ans,Math.min(cl,acl));
            }
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}