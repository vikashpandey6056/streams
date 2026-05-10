import java.util.*;
import java.util.stream.*;
public class FirstNonRepeatingCharacterUsingStream {

    public static void main(String[] args) {

        String str="Hello Boy how are you man";

        Optional<String> result=	str.chars()
                .mapToObj(c->(char)c+"")
                .collect(Collectors.groupingBy(
                        c->c.toLowerCase(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(e->e.getKey())
                .findFirst();

        System.out.println(result.get());

    }
}
