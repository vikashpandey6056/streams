import java.util.*;
import java.util.stream.*;
public class FilterDuplicateElementUsingStream {
    public static void main(String[] args) {

        Set<Integer> dictElement= new HashSet<>();

        List<Integer> lst=Arrays.asList(1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,5,6,7,8);

        List <Integer>duplicateLst=	lst.stream()
                .filter(e->!dictElement.add(e))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(duplicateLst);


    }
}
