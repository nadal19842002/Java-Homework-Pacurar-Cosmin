package a_25_05;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        /*pasul 1. creem un obiect din clasa Scanner(tastatura) pentru a permite utilizatorului
        sa introduca un numar intreg*/
        Scanner scanner = new Scanner(System.in);
        //pasul 2. solicitam utilizatorului sa introducaa un numar intreg intre 1 si 300
        System.out.println("Introdu un numar intreg intre 1 si 10: ");
        //pasul 3. atribuim referinta obiectului creat(tastatura) catre variabila a
        int a = scanner.nextInt();
        /*pasul 4. declaram si initializam o variabila in care vom retine rezultatul parcurgerii temporare a
        factorialului, precum si o variabila in care retinem valoarea factorialului*/
        int d,factorial=1;
        //pasul 6. Cu o bucla imbricata for calculam factorialul numarului introdus de utilizator
        for(int i=1;i<=1;i++){
            for (int j=1;j<=a;j++){
                 d = i*j;
                 factorial=factorial*d;
            }
        }
        //pasul 5. afisam rezultatul
        System.out.print(factorial);
    }
}