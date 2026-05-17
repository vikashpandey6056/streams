import java.util.*;
import java.util.stream.*;
public class ConvertingAllElementToUppercaseUsiingStream {
    public static void main(String[] args) {
        List<String> myList=List.of("Complex","Compiler","Cohert");

        myList=myList.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(myList);

    }
}
