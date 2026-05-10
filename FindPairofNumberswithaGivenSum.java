import java.util.*;
import java.util.stream.*;

public class FindPairofNumberswithaGivenSum {

    public static void main(String[] args) {
        List<Integer>lItr= List.of(1,2,3,4,5,6,7,8,9,10);
        int sum=11;

        long[] index={1};
        List<List<Integer>>result= lItr.stream()
                .map(i->new ArrayList<>(Arrays.asList(i,lItr.stream()
                        //.skip(index[0]++)
                        .filter(itr->itr+i==sum)
                        .findFirst()
                        .orElse(null)

                )))
                .filter(li->li.get(1)!=null)
                .collect(Collectors.toList());

        System.out.println(result);


    }
}
