package a1_25_05;

public class SmallestNumberArray {
    public static void main(String[] args) {
        //pasul 1. declaram si initializam un vector de 3 elemente
        int [] array = {10,20,30};
        //pasul 2. presupunem ca primul element al vectorului este cel mai mic
        int min = array[0];
        /*pasul 3. parcurgem cu un for elementele vectorului si comparam elementele cu elementul vectorului
        declarat ca avand valoarea minima de mai sus*/
        for(int i=0;i<=array.length-1;i++){
            if (array[i] < min)
                min = array[i];}
        System.out.println("Elementul cu valoarea minima din vectorul propus este"+" "+min);
        /*pasul 4. parcurgem cu un for each elementele vectorului si comparam elementele cu elementul vectorului declarat
        ca avand valoarea minima de mai sus*/
        for (int e: array) {
            if(e<min)
                System.out.println("Elementul cu valoarea minima este"+" "+e);
            else
                continue;
        }
        System.out.println("Elementul cu valoarea minima din vectorul propus, parcurs cu"+
                " bucla for each, este"+" "+min);


}}
