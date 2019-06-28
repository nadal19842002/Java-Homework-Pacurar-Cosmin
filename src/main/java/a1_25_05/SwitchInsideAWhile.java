package a1_25_05;

import java.util.Scanner;

public class SwitchInsideAWhile {
    public static void main(String[] args) {
        //pasul 1. initializam doua variabile de tip int cu care o sa facem operatii
        int a = 1;
        int b = -1;
        //pasul 2. creem un obiect din clasa String pentru a-i atribui o valoare de String
        String operation = new String();
        /*pasul 3. creem un obiect din clasa Scanner(tastatura) pentru a permite utilizatorului
        sa introduca un String*/
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti operatia dorita: ");
        operation = input.next();
        /*pasul 4. cu un switch in while, verificam conditia de executare a buclei while
        si inteam prin switch in cazul aferent*/
        while (a < 10_000 && b > -10_000) {
        switch (operation) {
            case "+"://in case-uri se pot folosi numere intregi,string-uri si booleni
                System.out.println(a + " + " + b + "=" + (a + b));
                a++;
                b--;
                break;
            case "-":
                System.out.println(a + " - " + b + "=" + (a - b));
                a++;
                b--;
                break;
            case "*":
                System.out.println(a + " * " +b + "=" + (a * b));
                a++;
                b--;
                break;
            case "/":
                System.out.println(a+ " / " + b + "=" + (a / b));
                a++;
                b--;
                break;
            default:
                System.out.println("bad operation!");

        }
    }
    }
}