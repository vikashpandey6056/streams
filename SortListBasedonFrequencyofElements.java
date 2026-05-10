
import java.util.*;
import java.util.stream.*;
public class SortListBasedonFrequencyofElements {

    public static void main(String[] args) {

        List<Integer>lItr=List.of(1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6);

        List<Integer>result=lItr.stream()
                .collect(Collectors.groupingBy(
                        i->i,
                        Collectors.counting()))       // Getting distinct element based upon frequencey of each element
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry<Integer,Long>::getValue).reversed())
                .map(e->e.getKey())
                .collect(Collectors.toList());


        result=lItr.stream()
                .collect(Collectors.groupingBy(
                        i->i,
                        Collectors.counting()))              //Getting all the element based upon frequencey of their occurance
                .entrySet()
                .stream()
                .sorted(Comparator.comparingLong(Map.Entry<Integer,Long>::getValue).reversed())
                .flatMap(e->IntStream.iterate(0,i->i<e.getValue(),i->i+1)
                        .boxed()
                        .map(i->e.getKey())
                )
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
