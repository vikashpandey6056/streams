import java.util.*;
import java.util.stream.*;
public class GroupingStringByLength {public static void main(String[] args) {

    List<String> myList=List.of("Hello","world","are","you","ready","once","more","are","you","ready");

    Map<Integer,Set<String>>group=myList.stream()
            .collect(Collectors.groupingBy(
                    e->e.length(),
                    Collectors.toSet()
            ));

    group.entrySet()
            .stream()

            .forEach(e->{System.out.println(e.getKey()+" "+e.getValue());});


}
}

