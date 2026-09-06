class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
              i++;
              j--;
        }
      
        int x=0;
        int y=k-1;
        while(x<y){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
               x++;
               y--;
        }
          int a=nums.length-1;
    while(k<a){
        int temp=nums[k];
        nums[k]=nums[a];
        nums[a]=temp;
        k++;
        a--;
    
    }
  
    }
}