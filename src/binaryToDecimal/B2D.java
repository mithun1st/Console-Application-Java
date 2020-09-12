package binaryToDecimal;

import java.util.Scanner;
public class B2D {
    public static int pow(int a,int b){
        int x=1;
        for(int i=0;i<b;i++){
            x*=a;
        }
        return x;
    }

    public static void main(String[] args) {
        String str;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Binary number to convert Decimal: ");
        str=sc.nextLine();
//make character to own string----------
        int l=str.length();
        int[] num=new int[l];
        char[] c=new char[l];
        String[] st=new String[l];
        for(i=0;i<l;i++){
            c[i]=str.charAt(i);
        }
        for(int j=0;j<str.length();j++){
            st[j]=String.valueOf(c[j]);
            //st[j]=Character.toString(c[j]);
        }
        //for(int j=0;j<l;j++){
            //System.out.println(st[j]);
        //}
//String convert into integer array--------        
        for(int j=0;j<str.length();j++){
            num[j]=Integer.parseInt(st[j]);
        }
//next stage binary to decimal ------------
        int sum=0,x;
        i=0;
        for(int j=l-1;0<=j;j--){
            x=num[j]*pow(2,i);
            sum+=x;
            i++;
        }
        System.out.println("The number of "+str+" decimal is: "+sum);
    }

}
