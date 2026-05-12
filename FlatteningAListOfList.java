import java.util.*;
import java.util.stream.*;
public class FlatteningAListOfList {
    public static void main(String[] args) {

        List<List<Integer>>listOfListOfInteger=List.of(List.of(1,2,3,4),
                List.of(5,6,7),
                List.of(8,9,10));

        List<Integer> result=listOfListOfInteger.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        result.stream()
                .forEach(e->System.out.print(e+" "));
    }
}
