import java.util.*;
import java.util.stream.*;
public class DistinctInStream {
    public static void main(String[] args) {
        List<Integer> lItr=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,0,9,8,7,6,5,4,5,6,7,8);

        List<Integer>result=lItr.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
