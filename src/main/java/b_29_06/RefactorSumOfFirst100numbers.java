package b_29_06;

public class RefactorSumOfFirst100numbers {
    public static void main(String[] args) {
        int b=100;
        System.out.println(sum(b));
        }
        public static int sum(int a){

            int sum = 0;
            a=100;
            for (int i = 1; i <= a; i++) {
                sum = sum + i;
            }
            return sum;

        }
    }
