package b_22_06;

import java.util.Scanner;

public class RefactorPalindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu un numar intre 10 si 1000: ");
        int numar = input.nextInt();
        System.out.println("Este numarul palindrom? ");
        System.out.println(palindromSauNu(numar));
    }
    public static boolean palindromSauNu(int a){

        int b=a;
        int invers = 0;
        while(a!=0){
            int c = a%10;
            invers = invers*10+c;
            a = a/10;
        }
        //pasul 7. verificam daca numarul introdus de utilizator coincide cu inversul acestuia
        if(b==invers)
            return true;
        else
            return false;
    }
}
