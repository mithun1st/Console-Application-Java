package autoUpperCase;
import java.util.Scanner;

public class firstWordUpperCase {
    public static char upr(char chh){
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

        ar=s1.toCharArray();
        //------------
        if(ar[0]>=97 && ar[0]<=122){
            ar[0]=upr(ar[0]);
        }
        for(int i=0;i<s1.length();i++){
            if(ar[i]==' '){
                if(ar[i+1]>=97 && ar[i+1]<=122){
                    ar[i+1]=upr(ar[i+1]);
                }
            }
        }
        s1=String.valueOf(ar);       
        System.out.println(s1);
    }

}
