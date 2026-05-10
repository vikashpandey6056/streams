import java.util.*;
import java.util.stream.*;
public class SlidingWindowOfNElementUsingStream {

    public static void main(String[] args) {
        List<Integer>lItr=List.of(1,2,3,4,5,6,7,8,9,10);
        int n=3;
        IntStream.iterate(0,i->i<lItr.size(),i->i+=3)
                .forEach(i->{lItr.stream()
                        .skip(i)
                        .limit(n)
                        .forEach(it->System.out.print(it));
                    System.out.println();});

        List<List<Integer>>llItr=IntStream.iterate(0,i->i<10,i->i+3)

                .mapToObj(
                        i-> lItr.stream()
                                .skip((long)i)
                                .limit(n)
                                .collect(Collectors.toList())
                ).collect(Collectors.toList());

        System.out.println(llItr);

    }
}
