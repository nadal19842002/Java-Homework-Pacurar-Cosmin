package g_17_08;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
    public List<Long> generateList (long numbers){
       return Stream.iterate(new long[]{0,1}, i -> new long[]{i[1],i[0] + i[1]})
               .limit(numbers).map(i -> i[0]).collect(Collectors.toList());
    }
}
