import java.util.*;
import java.util.stream.*;
public class ConcatinatingStringUsingStream {
    public static void main(String[] args) {

        List<String>myListStr=List.of("hello","world","how","are","you");

        String str = myListStr.stream()
                .reduce((a, b) -> a + " " + b)
                .orElse("");

        String str2 = myListStr.stream()
                .collect(Collectors.joining(", "));

        System.out.println(str);
        System.out.println(str2);
    }
}
