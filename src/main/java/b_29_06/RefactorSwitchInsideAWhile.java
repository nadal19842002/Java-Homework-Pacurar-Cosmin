package b_29_06;

import java.util.Scanner;

public class RefactorSwitchInsideAWhile {
    public static void main(String[] args) {
        System.out.println(adevaratSauFals(25, 5, "/"));
    }

    public static boolean adevaratSauFals(int numar1, int numar2, String h) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        numar1 = scanner.nextInt();
        System.out.println("Introdu al doilea numar: ");
        numar2 = scanner.nextInt();
        System.out.println("Introdu operatia dorita: ");
        h = scanner.next();
        while (numar1 < 10_000_000 && numar2 > -10_000_000 && numar1!=0 &&numar2!=0) {
            switch (h) {
                case "+"://in case-uri se pot folosi numere intregi,string-uri si booleni
                    //boolean d;
                    System.out.println(numar1 + " + " + numar2 + "=" + (numar1 + numar2));
                   numar1++;
                   numar2--;
                break;
                case "-":
                    //boolean d;
                    System.out.println(numar1 + " - " + numar2 + "=" + (numar1 - numar2));
                    numar1++;
                    numar2--;
                break;
                case "*":
                   // boolean d = true;
                    System.out.println(numar1 + " * " + numar2 + "=" + (numar1 * numar2));
                    numar1++;
                    numar2--;
                break;
                case "/":
                    //boolean d = true;
                    System.out.println(numar1 + " / " + numar2 + "=" + (numar1 / numar2));
                      numar1++;
                      numar2--;
                break;
                default:
                    return false;
            }
            //return true;
        }
        return true;
    }
}