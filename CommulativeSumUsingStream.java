import java.util.*;
import java.util.stream.*;
public class CommulativeSumUsingStream {

    public static void main(String[] args) {

        List<Integer> lItr=List.of(10,20,30,40,50,60,70,80,90,100);
        List<Integer>result=IntStream.range(0,lItr.size())
                .map(i-> lItr.subList(0,i)
                        .stream()
                        .mapToInt(itr->itr)
                        .sum())
                .boxed()
                .collect(Collectors.toList());

        System.out.println(result);

    }
}


