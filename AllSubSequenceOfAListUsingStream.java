import java.util.*;
import java.util.stream.*;
public class AllSubSequenceOfAListUsingStream {
    public static void main(String[] args) {

        List<Integer>lItr=List.of(1,2,3);

        List<List<Integer>>result=IntStream.iterate(1,i->i<=lItr.size(),i->i+1)
                .boxed()
                .flatMap(i->IntStream.iterate(0,j->j<=lItr.size()-i,j->j+1)
                        .mapToObj(j->lItr.subList(j,j+i))
                )
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
