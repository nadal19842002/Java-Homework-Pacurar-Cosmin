package a1_25_05;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        /*pasul 1. creem un obiect din clasa Scanner(tastatura) pentru a permite utilizatorului
        sa introduca un numar de la tastatura*/
        Scanner scanner = new Scanner(System.in);
        //pasul 2. solicitam utilizatorului sa introduca un numar de la tastatura
        System.out.println("Introdu un numar: ");
        //pasul 3. atribuim referinta obiectului creat din clasa Scanner catre variabila a
        int a = scanner.nextInt();
        /*pasul 4. cu primul for parcurgem numerele de la 2 la nr introdus de utilizator
        cu al doilea for parcurgem deimpartitul.daca deimpartirul=numarul,acela e prim,
        daca numarul impartit la deimpartit da rest 0 iesim din program*/

        for(int i=2;i<=a-1;i++){
            for(int j=2;j<=i;j++){
                if(j==i){
                    System.out.print(i);
                }
                if(i%j==0){
                    break;
                }
            }
        }
    }
}

