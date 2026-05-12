import java.util.*;
import java.util.stream.*;
public class NullRemoverUsingStream {
    public static void main(String[] args) {

        List<String>lstr=Arrays.asList("Hello",null,"boy","how","are","you",null);

        lstr=lstr.stream()
                .filter(e->e!=null)
                .collect(Collectors.toList());

        System.out.println(lstr);

        List<String> words = Arrays.asList("Java", null, "Stream", null, "API");
        List<String> nonNullWords = words.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

        System.out.println(nonNullWords);

    }
}
