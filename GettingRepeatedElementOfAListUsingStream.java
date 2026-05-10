import java.util.*;
import java.util.stream.*;
public class GettingRepeatedElementOfAListUsingStream {
    public static void main(String[] args) {

        List<Integer>lItr=List.of(1,1,1,2,2,3,3,4,4,5,6,7,8,8,9,9,10);

        List<Integer>result=lItr.stream()
                .filter(i->lItr.indexOf(i)!=lItr.lastIndexOf(i))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);

    }}
