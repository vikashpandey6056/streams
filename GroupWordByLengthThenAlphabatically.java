import java.util.*;
import java.util.stream.*;
public class GroupWordByLengthThenAlphabatically {

    public static void main(String[] args) {
        List<String>lStr=new ArrayList<>(Arrays.asList("hello","boy","how","are","you","man","hope","you","are","doing","good"));

        Map<Integer,List<String>>result=lStr.stream()
                .collect(Collectors.groupingBy(
                        s->s.length()
                ))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        entry->entry.getKey(),
                        entry->entry.getValue()
                                .stream()
                                .sorted()
                                .collect(Collectors.toList())));

        System.out.println(result);

        result=  lStr.stream()
                .collect(Collectors.groupingBy(
                        s->s.length(),
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list-> list.stream()
                                        .sorted()
                                        .collect(Collectors.toList()))));

        System.out.println(result);
    }
}
