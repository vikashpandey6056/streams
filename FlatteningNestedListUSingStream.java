import java.util.*;
import java.util.stream.*;
public class FlatteningNestedListUSingStream {

    public static void main(String[] args) {
        List<List<Integer>>llItr=List.of(List.of(1,2,3,4,5),
                List.of(6,7,8,9,10),
                List.of(11,12,13,14,15),
                List.of(16,17,18,19,20),
                List.of(21,22,23,24,25),
                List.of(26,27,28,29,30),
                List.of(31,32,33,34,35),
                List.of(36,37,38,39,40),
                List.of(41,42,43,44,45));

        List<Integer>result=llItr.stream()
                .flatMap(lItr->lItr.stream())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
