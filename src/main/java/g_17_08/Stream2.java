package g_17_08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Stream2 {
    public static void main( String[] args ) {


        List<Trader> traders = new ArrayList<>();
        traders.add(new Trader("Aubameyang", "Bucharest"));
        traders.add(new Trader("Dulca", "Cluj"));
        traders.add(new Trader("John", "Galati"));

        List<Trader> collect = traders.stream().sorted(comparing(Trader::getCity)).collect(Collectors.toList());

        System.out.print(collect);
    }
}