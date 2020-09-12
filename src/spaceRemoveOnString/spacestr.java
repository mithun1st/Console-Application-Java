package spaceRemoveOnString;

import java.util.Scanner;
public class spacestr {

    public static void main(String[] args) {
        String str;
        int c=0;
        Scanner scn=new Scanner(System.in);
        str=scn.nextLine();

        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                continue;
            }
            System.out.print(str.charAt(i));
            }
        System.out.println("");
    }
}