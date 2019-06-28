package a1_25_05;

import java.util.Scanner;

public class IfElseCalculator {
    public static void main(String[] args) {
            /*pasul 1. creem un obiect din clasa Scanner(tastatura) pentru a permite utilizatorului
            sa introduca un numar*/
            Scanner scanner = new Scanner(System.in);
            //pasul 2. solicitam utilizatorului sa introduca numerele si operatia dorita ca string
            System.out.println("Introduceti primul numar:  ");
            int firstNumber = scanner.nextInt();
            System.out.println("Introduceti al doilea numar:  ");
            int secondNumber = scanner.nextInt();
            System.out.println("Introduceti operatia dorita:  ");
            String operation = new String();
            operation = scanner.next();
            String s1 = new String();
            s1 = "+";
            String s2 = new String();
            s2 = "-";
            String s3 = new String();
            s3 = "*";
            String s4 = new String();
            s4 = "/";
            /*pasul 3. comparam valorile variabilelor de referinta prin metoda equals din clasa String
            si afisam rezultatul*/
            if(operation.equals(s1))
                System.out.println(firstNumber+" + "+ secondNumber+"=" + (firstNumber+secondNumber));
            if(operation.equals(s2))
                    System.out.println(firstNumber+" - "+ secondNumber+"=" + (firstNumber-secondNumber));
            if(operation.equals(s3))
                    System.out.println(firstNumber+" * "+ secondNumber+"=" + (firstNumber*secondNumber));
            if(operation.equals(s4))
                    System.out.println(firstNumber+" / "+ secondNumber+"=" + (firstNumber/secondNumber));

            /*switch(operation){
                case "+"://in case-uri se pot folosi numere intregi,string-uri si booleni
                    System.out.println(firstNumber+" + "+ secondNumber+"=" + (firstNumber+secondNumber));
                    break;
                case "-":
                    System.out.println(firstNumber+" - "+ secondNumber+"=" + (firstNumber-secondNumber));
                    break;
                case " *":
                    System.out.println(firstNumber+" * "+ secondNumber+"=" + (firstNumber*secondNumber));
                    break;
                case "/":
                    System.out.println(firstNumber+" / "+ secondNumber+"=" + (firstNumber/secondNumber));
                    break;
                default:
                    System.out.println("bad operation!");*/
    }
}
