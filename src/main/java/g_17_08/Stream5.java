package g_17_08;

import java.util.Arrays;
import java.util.List;

public class Stream5 {

    public static void main( String[] args ) {
        Trader john = new Trader("John", "New York");
        Trader buck = new Trader("Buck", "Galati");
        Trader james = new Trader("James", "Ontario");
        Trader phillip = new Trader("Phillip", "New York");

        List<Transaction> transactions = Arrays.asList(new Transaction(john, 2011, 5000),
                new Transaction(buck, 2012, 6000), new Transaction(john, 2017, 888),
                new Transaction(phillip, 2016, 5));

        transactions.stream().filter(transaction -> "Galati".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue).forEach(System.out::println);
    }
}

