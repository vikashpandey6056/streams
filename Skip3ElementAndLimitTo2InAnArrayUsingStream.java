import java.util.*;
import java.util.stream.*;
public class Skip3ElementAndLimitTo2InAnArrayUsingStream {

    public static void main(String[] args) {

        List<Integer>lItr=List.of(1,2,3,4,5,6,7,8,9);

        List<Integer>result=lItr.stream()
                .skip(3)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
