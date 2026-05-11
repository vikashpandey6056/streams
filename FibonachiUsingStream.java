import java.util.*;
import java.util.stream.*;
 class FibonachiUsingStream {


    public static void main(String[] args) {

        List<Integer>prevCurr=Arrays.asList(0,1);

        int n=14;


        List<Integer>result = IntStream.range(0,n)
                .map(i->{int temp=prevCurr.get(0);
                    int sum=temp+prevCurr.get(1);
                    prevCurr.set(0,prevCurr.get(1));
                    prevCurr.set(1,sum);
                    return temp;})
                .boxed()
                .collect(Collectors.toList());

        System.out.println(result);

        //MORE EASIER WAY WITH STATELESS APPROACH

  /* Stream.iterate() have 2 format
  iterate(seader,nextfunction) //always need to use limit other wise stream will go infinte
  iterate(seader,condition,next) //example Stream.iterate(1, n -> n <= 10, n -> n + 1)
  */

        result= Stream.iterate(new int[]{0,1}  ,  f->new int[]{f[1],f[0]+f[1]})
                .limit(n)
                .map(f->f[0])
                .collect(Collectors.toList());

        System.out.println(result);

    }
}


