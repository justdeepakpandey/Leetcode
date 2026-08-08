class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        char[] arr=new char[26];
        for(char i: p.toCharArray()){
            arr[i-'a']++;
        }
        for(int i=0;i<=s.length()-p.length();i++){
            char[] nums=new char[26];
            for(int j=i;j<i+p.length();j++){
                nums[s.charAt(j)-'a']++;

            }
            if(Arrays.equals(nums,arr)){
                list.add(i);
            }
        }
        return list;
    }
}