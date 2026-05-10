import java.util.*;
import java.util.stream.*;
public class AllSubSequenceOfAStringUsingStream {
    public static void main(String[] args) {

        String str="Fun";

        List<String>result;

        // result=IntStream.iterate(1,i->i<=str.length(),i->i+1)
        // .mapToObj(itr->
        //     IntStream.iterate(0,j->j<=str.length()-itr,j->j+1)
        //     .mapToObj(jtr->str.substring(jtr,jtr+itr))
        //     .collect(Collectors.toList())
        //     )
        // .collect(Collectors.toList())
        // .stream()
        // .flatMap(li->li.stream())
        // .collect(Collectors.toList());

        result=IntStream.iterate(1,i->i<=str.length(),i->i+1)
                .boxed()
                .flatMap(i->IntStream.iterate(0,j->j<=str.length()-i,j->j+1)
                        .mapToObj(j->str.substring(j,j+i)))
                .collect(Collectors.toList());


        System.out.println(result);

    }
}
