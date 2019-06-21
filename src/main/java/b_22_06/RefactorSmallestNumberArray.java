package b_22_06;

public class RefactorSmallestNumberArray {
    public static void main(String[] args) {
        int [] array = {1,4,7};
        System.out.print(smallest(array));
    }
    public static int smallest (int[] a){
         a = {10,20,30};
        int min = a[0];
        for(int i=0;i<=a.length-1;i++){
            if (a[i] < min)
                min = a[i];}
        for (int e: a) {
            if (e < min)
                System.out.println("Elementul cu valoarea minima este" + " " + e);
            else
                continue;
        }
        return min;
    }



}
