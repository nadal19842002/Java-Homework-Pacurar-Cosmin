package g_17_08;

import java.util.Arrays;
import java.util.List;

public class Stream6 {

    public static void main( String[] args ) {
        Trader john = new Trader("John","New York");
        Trader edy = new Trader("Edy","Dallas");
        Trader simon = new Trader("Simon","Mamaia");
        Trader paul = new Trader("Paul","London");

        List<Transaction> transactions = Arrays.asList(new Transaction(john,2019,5555),
                new Transaction(edy,2018,7777), new Transaction(simon,2015,3214),
                new Transaction(paul,2014,888),new Transaction(edy,2017,454));


        Transaction tr = transactions.stream().max((transaction1, transactions2 )->transaction1.getValue()>transactions2.getValue()? 1 : - 1).get();

        System.out.println(tr);
    }
}
