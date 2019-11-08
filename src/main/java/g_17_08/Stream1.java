package g_17_08;

import java.util.Arrays;
import java.util.List;

public class Stream1 {

    public static void main( String[] args ) {


    Trader John = new Trader("Ion","Galati");
    Trader Aubameyang = new Trader("Aubameyang","Bucharest");
    Trader Dulca = new Trader("Dulca","Cluj");

    List<Transaction> transactions = Arrays.asList(
            new Transaction(John,2000,1500),
            new Transaction(Aubameyang,2001,5000),
            new Transaction(Dulca,2004,8000),
            new Transaction(John, 2008, 3000));
//            new Transaction(Aubameyang,2004,20000));


}
}