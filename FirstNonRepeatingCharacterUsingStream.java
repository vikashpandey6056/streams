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


        /* My approch */

// 		String str="complex Compiler choert";

// 	Character cho = str.chars()
//         .mapToObj(cha -> (char) cha)
//         .map(chare->Character.toLowerCase(chare))
//         .collect(Collectors.groupingBy(
//                 ch -> ch,
//                 LinkedHashMap::new,
//                 Collectors.counting()))
//         .entrySet()
//         .stream()
//         .filter(e->e.getValue()==1)
//         .sorted((a, b) -> Long.compare(a.getValue(), b.getValue()))
//         .map(a -> a.getKey())
//         .findFirst()
//         .orElse(null);

// 		              System.out.println(cho);

        /* Suggested Approach */

        String input = "swiss";
        Optional<Character> firstNonRepeated = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst();
        System.out.println(firstNonRepeated.orElse(null));
    }
}
