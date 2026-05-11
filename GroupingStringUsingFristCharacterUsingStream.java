import java.util.*;
import java.util.stream.*;
public class GroupingStringUsingFristCharacterUsingStream {
    public static void main(String[] args) {
        List<String>lStr=List.of("Hello","boy","how","are","you","man","hope","you","are","doing","good");

        Map<Character,List<String>>result=lStr.stream()
                .collect(Collectors.groupingBy(
                        s->s.toLowerCase().charAt(0)));

        result.entrySet()
                .stream()
                .forEach(e->System.out.println(e.getKey()+" "+e.getValue()));

    }
}
