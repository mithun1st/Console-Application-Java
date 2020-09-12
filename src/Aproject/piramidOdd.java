package Aproject;

public class piramidOdd {

    public static void main(String[] args) {        
        int l=5;    //input line??
        int[] od= new int [l];
        int c=1;
        for (int i = 0; i < l; i++) {
            od[i]=c;
            c+=2;
        }
        for (int i = 0; i < l; i++) {
            for (int j = l; 0 < j-i; j--) {
                System.out.print(" ");
            }
                for (int j = 0; j < i; j++) {
                    System.out.print(""+od[j]);
                }
                for (int j = i; j>=0; j--) {
                    System.out.print(""+od[j]);
                }
            System.out.println("");
        }
    }

}
