class Solution {
    public boolean checkString(String s) {
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='b'&&s.charAt(i+1)=='a'){
                return false;
                
            }else if(s.charAt(i)=='a'&&s.charAt(i+1)=='b'){
                continue;
            }else if(s.charAt(i)=='b'&&s.charAt(i+1)=='b'){
                continue;
            }else if(s.charAt(i)=='a'&&s.charAt(i+1)=='a'){
                continue;
            }
        }
        return true;
    }
}