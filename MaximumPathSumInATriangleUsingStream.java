import java.util.*;
import java.util.stream.*;
public class MaximumPathSumInATriangleUsingStream {

    public static void main(String[] args) {
        List<List<Integer>>lItr=List.of(
                List.of(1),
                List.of(1,2),
                List.of(1,2,3),
                List.of(1,2,3,4),
                List.of(1,2,3,4,5),
                List.of(1,2,3,4,5,6),
                List.of(1,2,3,4,5,6,7)
        );

        int result= lItr.stream()
                .map(lis->{if(lis==lItr.get(0))
                    return lis;
                    if(lis==lItr.get(lItr.size()-1))
                        return lis;
                    else
                        return List.of(lis.get(0),lis.get(lis.size()-1));
                }).flatMap(lis->lis.stream())
                .mapToInt(li->li)
                .sum();

        System.out.println(result);


    }
}
