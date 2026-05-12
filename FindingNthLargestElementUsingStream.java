import java.util.*;
import java.util.stream.*;
public class FindingNthLargestElementUsingStream {
    public static void main(String[] args) {
        int findNthLargestElement=5;

        int[]arr={1,2,3,4,5,6,7,8,9,10,11,12};


        Optional<Integer> result= Arrays.stream(arr)
                .boxed()
                .sorted((a,b)->b-a)
                .skip(findNthLargestElement)
                .findFirst();

        System.out.println(result.get());


    }
}
