class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int h =0;
        int w =0;
        int a =0;
        int max =Integer.MIN_VALUE;
        while(i<j){
         h=Math.min(height[i],height[j]);
         w=j-i;
         a=h*w;
        max=Math.max(a,max);
        if(height[i]<=height[j]){
            i++;
        }else if(height[i]>height[j]){
            j--;
        }
        }
        return max;
    }
}