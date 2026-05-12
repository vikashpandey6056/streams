import java.util.*;
import java.util.stream.*;
public class MostCommonCharacterInAStringUsingStream {
    public static void main(String[] args) {

    String str="hello boy how are you mannnnnnn";

    Optional<Character> result=str.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(
                    c->c,
                    Collectors.counting()))
            .entrySet()
            .stream()
            .sorted((a,b)->(int)(b.getValue()-a.getValue()))
            .map(e->e.getKey())
            .findFirst();

    System.out.println(result.get());


}
}
