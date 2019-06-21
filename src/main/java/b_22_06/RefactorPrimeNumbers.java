package b_22_06;

import java.util.Scanner;

public class RefactorPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int a = input.nextInt();
        System.out.println(numerePrime(a));
    }
    public static int numerePrime(int b){
        for(int i=2;i<=b-1;i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    System.out.print(i);
                }
                if (i % j == 0) {
                    break;
                }
                return j;
            }
            //return j;
        }
    }
}