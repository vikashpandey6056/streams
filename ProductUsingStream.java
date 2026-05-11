import java.util.*;
import java.util.stream.*;
public class ProductUsingStream {
    public static void main(String[] args) {
        List<Integer> lIstr=List.of(1,2,3,4);

        int result=lIstr.stream()
                .reduce(1,(a,b)->a*b);

        System.out.println(result);
    }
}
