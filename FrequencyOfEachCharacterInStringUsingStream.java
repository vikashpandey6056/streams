import java.util.*;
import java.util.stream.*;
public class FrequencyOfEachCharacterInStringUsingStream {
    public static void main(String[] args) {

        String str="consolidation cordination, courtesy";

        Map<Character,Long>result=str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,
                        Collectors.counting()));

        System.out.println(result);
    }
}
