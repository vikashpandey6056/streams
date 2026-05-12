import java.util.*;
import java.util.stream.*;
public class ReversingEachElementOfAListUsingStream {
    public static void main(String[] args) {

        List<String>sList=Arrays.asList("war","sa","a","loot");

        sList=sList.stream()
                .map(s->new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(sList);

    }
}
