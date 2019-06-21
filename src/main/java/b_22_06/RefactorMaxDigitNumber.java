package b_22_06;

import java.util.Scanner;

public class RefactorMaxDigitNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Introdu de la tastatura un numar intreg: ");
         int b = input.nextInt();
         System.out.println(daMaximum(b));
    }
    public static int daMaximum(int z){
        int maxDigit=1;
        while(z!=0){
            int c=z%10;
            if(c>maxDigit){
                maxDigit=c;}
            z=z/10;
        }
        return maxDigit;
    }
}
