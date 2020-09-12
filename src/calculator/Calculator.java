package calculator;

import java.util.Scanner;
public class Calculator {
    
    public static void main (String[] args){
        float a,b;
        char s;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        s= sc.next().charAt(0);

        switch(s){
            case '+':
                b = sc.nextFloat();
                System.out.printf("Result is: "+(a+b));
                break;
            case '-':
                b = sc.nextFloat();
                System.out.printf("Result is: "+(a-b));
                break;
            case '*':
                b = sc.nextFloat();
                System.out.printf("Result is: "+(a*b));
                break;
            case '/':
                b = sc.nextFloat();
                System.out.printf("Result is: "+(a/b));
                break;
                
            default:
                System.out.println("syntext error");
                break;
        }
        System.out.println("");
        
    }
}