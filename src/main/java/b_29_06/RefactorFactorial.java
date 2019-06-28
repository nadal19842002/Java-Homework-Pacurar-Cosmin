package b_29_06;

import java.util.Scanner;

public class RefactorFactorial {

    public static int daFactorialul(int a) {
        int factorial=1;
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= a; j++) {
                factorial = i * j;
            }
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int d = input.nextInt();
        System.out.println(daFactorialul(d));
    }
}
