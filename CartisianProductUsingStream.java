import java.util.*;
import java.util.stream.*;
public class CartisianProductUsingStream {
    public static void main(String[] args) {
        //cartisian product using stream
        List<Integer>lItr1=List.of(1,2,3);
        List<Integer>lItr2=List.of(1,2,3);

        List<Integer>resultItr=lItr1.stream()
                .flatMap(i->lItr2.stream()
                        .map(e->e*i))
                .collect(Collectors.toList());

        System.out.println(resultItr);

        List<String>resultStr=lItr1.stream()
                .flatMap(i->lItr2.stream()
                        .map(e->"("+i+" "+e+")"))
                .collect(Collectors.toList());
        System.out.println(resultStr);

        List<List<Integer>>resultLst=lItr1.stream()
                .flatMap(i->lItr2.stream()
                        .map(e->List.of(i,e)))
                .collect(Collectors.toList());

        System.out.println(resultLst);

    }
}
