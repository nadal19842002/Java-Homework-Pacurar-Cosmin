package g_17_08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Stream3 {

    public static void main( String[] args ) {

        List<Trader> traders = new ArrayList<>();

        traders.add(new Trader("Lucian","Milano"));
        traders.add(new Trader("Mario","Venezia"));
        traders.add(new Trader("Ion","Vaslui"));
        traders.add(new Trader("Vasile","Barlad"));

        List<Trader> collect = traders.stream().filter(trader -> trader.getCity() == "Venezia").sorted(comparing(Trader::getName)).collect(Collectors.toList());

        System.out.println(collect);
    }

}
