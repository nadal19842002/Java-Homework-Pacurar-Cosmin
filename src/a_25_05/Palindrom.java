package a_25_05;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        /*pasul 1. creem un obiect din clasa Scanner(tastatura) pt a permite utilizatorului sa introduca
        un numar intreg*/
        Scanner scanner = new Scanner(System.in);
        //.pasul 2. solicitam utilizatorului sa introduca un numar intreg intre 10 si 1000
        System.out.println("Introdu un numar intreg intre 10 si 1000: ");
        //pasul 3. atribuim referinta obiectului scanner catre variabila a
        int a = scanner.nextInt();
        /*pasul 4. creem o copie a variabilei a pt a putea verifica ulterior daca inversul numarului
        propus de utilizator este acelasi cu acesta*/
        int b=a;
        /*pasul 5. declaram si initializam variabila invers in care vom reconstitui numarul de la ultima
        cifra pana la prima*/
        int invers = 0;
        /*pasul 6. cu o bucla while,reconsituim numarul introdus de utilizator de la ultima cifra catre
        prima prin descompunerea numarului initial introdus de utilizator in cifre
         */
        while(a!=0){
            int c = a%10;
            invers = invers*10+c;
            a = a/10;
        }
        //pasul 7. verificam daca numarul introdus de utilizator coincide cu inversul acestuia
        if(b==invers)
            System.out.println("Numarul"+" "+b+" este palindrom!");
        else
            System.out.println("Numarul"+" "+b+" nu este palindrom!");

    }
}
