package b_29_06;

import java.util.Scanner;

public class RefactorPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(nrPrime(17));
    }

    public static int nrPrime(int a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        a = scanner.nextInt();
        int g = -100;
        for (int i = 2; i <= a - 1; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i) {
                    //return i;
                    g=i;
                }
                if (i % j == 0) {
                    break;
                }
            }
       }
        return g;
    }
}