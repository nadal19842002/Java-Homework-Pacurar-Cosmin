package a1_25_05;

public class SumOfFirst100Numbers {
    public static void main(String[] args) {
        //pasul 1. declaram si initializam o variabila de tip int cu valoarea 0
        int sum = 0;
        //pasul 2. prin intermediul structurii for, calculam suma primelor 100 numere intregi mai mari decat 0
        for(int i=1;i<=100;i++){
            sum =sum+i;
        }
        //pasul 3. afisam rezultatul
        System.out.println("Suma primelor 100 numere intregi mai mari decat 0 este"+" "+sum);
    }


}
