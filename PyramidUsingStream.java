import java.util.*;
import java.util.stream.*;
public class PyramidUsingStream {

    public static void main(String[] args) {

        List<Integer>lItr=Arrays.asList(1,2,3,4,5,6,7,8,9);

        IntStream.iterate(1,i->i<lItr.size(),i->i+1)
                .forEach(i->{ IntStream.iterate(i,j->j<lItr.size(),j->j+1)
                        .forEach(j->System.out.print(" "));

                    lItr.stream()
                            .limit(i)
                            .forEach(it->System.out.print(it+" "));

                    System.out.println();
                } );


    }
}
