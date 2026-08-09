class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                sum+=26*(i+1);
            }
            else if(s.charAt(i)=='b'){
                sum+=25*(i+1);
            }
            else if(s.charAt(i)=='c'){
                sum+=24*(i+1);
            }
            else if(s.charAt(i)=='d'){
                sum+=23*(i+1);
            }
            else if(s.charAt(i)=='e'){
                sum+=22*(i+1);
            }
            else if(s.charAt(i)=='f'){
                sum+=21*(i+1);
            }
            else if(s.charAt(i)=='g'){
                sum+=20*(i+1);
            }
            else if(s.charAt(i)=='h'){
                sum+=19*(i+1);
            }
            else if(s.charAt(i)=='i'){
                sum+=18*(i+1);
            }
            else if(s.charAt(i)=='j'){
                sum+=17*(i+1);
            }
            else if(s.charAt(i)=='k'){
                sum+=16*(i+1);
            }
            else if(s.charAt(i)=='l'){
                sum+=15*(i+1);
            }
            else if(s.charAt(i)=='m'){
                sum+=14*(i+1);
            }
            else if(s.charAt(i)=='n'){
                sum+=13*(i+1);
            }
            else if(s.charAt(i)=='o'){
                sum+=12*(i+1);
            }
            else if(s.charAt(i)=='p'){
                sum+=11*(i+1);
            }
            else if(s.charAt(i)=='q'){
                sum+=10*(i+1);
            }
            else if(s.charAt(i)=='r'){
                sum+=9*(i+1);
            }
            else if(s.charAt(i)=='s'){
                sum+=8*(i+1);
            }
            else if(s.charAt(i)=='t'){
                sum+=7*(i+1);
            }
            else if(s.charAt(i)=='u'){
                sum+=6*(i+1);
            }
            else if(s.charAt(i)=='v'){
                sum+=5*(i+1);
            }
            else if(s.charAt(i)=='w'){
                sum+=4*(i+1);
            }
            else if(s.charAt(i)=='x'){
                sum+=3*(i+1);
            }
            else if(s.charAt(i)=='y'){
                sum+=2*(i+1);
            }
            else if(s.charAt(i)=='z'){
                sum+=1*(i+1);
            }
        }
        return sum;
    }
}