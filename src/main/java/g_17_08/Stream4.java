package g_17_08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Stream4 {

    public static void main( String[] args ) {
        List<Trader> traders = Arrays.asList(new Trader("Kepa","Manchester"),
                new Trader("Chiriches","Sasuolo"),new Trader("Nita","Praga"),
                new Trader("Ramos","Madrid"));

        List<Trader> collect = traders.stream().sorted(comparing(Trader::getName)).collect(Collectors.toList());

        System.out.print(collect);

    }
}
