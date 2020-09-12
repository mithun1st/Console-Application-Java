package Aproject;


public class concat{
    
    public static void main(String[] args){
        String s1="Mahadi",s2="Hassan";
        int i,k;
        //tem char variables chh
        char[] chh=new char[15];
        //1st str convert to char and input chh
        for(i=0;i<s1.length();i++){
            chh[i]=s1.charAt(i);
        }
        //lenght of 1nd and 2nd str 
        int j=s1.length()+s2.length();
        //2nd str convert to char and input chh
        for(i=7,k=0;i<=j;i++,k++){
            chh[i]=s2.charAt(k);
        }
        //char to str
        s1=String.valueOf(chh);
        //print 1st str
        System.out.println(s1);
    }
}