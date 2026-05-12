import java.util.*;
import java.util.stream.*;
public class CommonElementBetweenTwoListUsingStream {
    public static void main(String[] args) {

        List<Integer>lItr=List.of(1,2,3,4);
        Integer result= lItr.stream()
                .filter(e->e%2==0)
                .map(e->e*e)
                .mapToInt(e->e)
                .sum();

        System.out.println(result);

    }
}
