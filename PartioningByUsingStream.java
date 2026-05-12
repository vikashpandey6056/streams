import java.util.*;
import java.util.stream.*;
public class PartioningByUsingStream {public static void main(String[] args) {

    List<Integer> litr=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    Map<Boolean,List<Integer>>result=litr.stream()
            .collect(Collectors.partitioningBy(
                    i->i%2==0));

    result.entrySet()
            .stream()
            .forEach(e->System.out.println(e.getKey()+" -> "+e.getValue()));
}
}
