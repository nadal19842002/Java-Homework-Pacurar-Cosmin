package b_29_06;

import java.util.Scanner;

public class RefactorIfElseCalculator {
    public static void main(String[] args) {
        System.out.println(adevaratSauFals(25,5,"/"));
    }
    public static boolean adevaratSauFals(int a,int b, String c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar:  ");
        int firstNumber = scanner.nextInt();
        System.out.println("Introduceti al doilea numar:  ");
        int secondNumber = scanner.nextInt();
        System.out.println("Introduceti operatia dorita:  ");
        String operation = scanner.next();
        if(operation.equals("+")){
           boolean z = (firstNumber + secondNumber == (firstNumber+secondNumber));
           return z;
        }
        else if(operation.equals("-")){
            boolean z = (firstNumber - secondNumber == (firstNumber-secondNumber));
            return z;
        }
        else if(operation.equals("*")){
            boolean z = (firstNumber * secondNumber == (firstNumber*secondNumber));
            return z;
        }
        else if(operation.equals("/")){
            boolean z = (firstNumber / secondNumber == (firstNumber/secondNumber));
            return z;
        }
         else{
             return false;}
    }
}
