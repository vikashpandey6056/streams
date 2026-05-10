import java.util.*;
import java.util.stream.*;
public class AnagramsUsingStream {
    public static void main(String[] args) {
        List<String>lStr= List.of("aba","baa","abc","cba","xyz");

        Map<String,List<String>>result=lStr.stream()
                .collect(Collectors.groupingBy(
                        word->word.chars()
                                .sorted()
                                .mapToObj(c->((char)c)+"")
                                .collect(Collectors.joining())

                ));

        System.out.println(result);
    }
}
