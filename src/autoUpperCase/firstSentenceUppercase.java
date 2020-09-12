package autoUpperCase;
import java.util.Scanner;

public class firstSentenceUppercase {
        public static char upr(char chh){
        int i,j;
        i=chh;
        chh=(char)((chh-97)+65);
        return chh;
    }

    public static void main(String[] args) {
//declaration
        Scanner sc=new Scanner(System.in);
        int n;
        String s1;
        char[] ar=new char[70];
        s1=sc.nextLine();

        s1=s1.toLowerCase();
        ar=s1.toCharArray();
        
//first index check 
        if(ar[0]>=97 && ar[0]<=122){
            ar[0]=upr(ar[0]);
        }
        for(int i=0;i<s1.length();i++){
            if(ar[i]=='#'){
                if(ar[i+1]>=97 && ar[i+1]<=122){
                    ar[i+1]=upr(ar[i+1]);
                }
            }
        }
        
//checking punctuation        
        for(int i=0;i<s1.length()-1;i++){
            if(ar[i]=='.' || ar[i]=='!' || ar[i]=='?'){
                for(int j=i; 0==0; j++){
                    if(ar[j]>=97 && ar[j]<=122){
                        ar[j]=upr(ar[j]);
                        break;
                    }
                }
            }    
        }
        s1=String.valueOf(ar);
        
//remove noun sign-
        int c=0;
        char[] tem=new char[70];
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!='#'){
                tem[c]=ar[i];
                c++;
            }
        }
        s1=String.valueOf(tem);

//remove bland space
        int j=0;
        char[] tem1=new char [70];
        for(int i=0; i<s1.length()-1; i++){
            if(s1.charAt(i)=='.' || s1.charAt(i)=='!' || s1.charAt(i)=='?' || s1.charAt(i)<=122){
                if(s1.charAt(i+1)==' '){
                    tem1[j]=tem[i];
                    j++;
                }
            }
        }
        System.out.println(tem1);
    }
}