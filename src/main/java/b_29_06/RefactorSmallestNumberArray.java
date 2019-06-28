package b_29_06;

public class RefactorSmallestNumberArray {
    public static void main(String[] args) {
System.out.println(smallestNumberArray());
    }

    public static int smallestNumberArray() {
        int[] array = {10, 20, 30};
        int min = array[0];
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }
}