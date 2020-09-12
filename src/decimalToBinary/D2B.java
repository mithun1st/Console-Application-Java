package decimalToBinary;

import java.util.Scanner;
public class D2B {

    public static void main(String[] args) {
        int i,x,in,num;
        int[] y=new int[8];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Decimal number to convert Binary: ");
        in=sc.nextInt();
        num=in;
        for(i=0;0==0;i++){
            x=num%2;
            num=num/2;
            y[i]=x;
            if (num==0){
                break;
            }
        }
        System.out.print("The number of "+in+" binary is: ");
        for (int j=i;j>=0;j--){
            System.out.print(y[j]);
        }
        System.out.println("");
    }

}
