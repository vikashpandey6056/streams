import java.util.*;
import java.util.stream.*;
public class FormingMapFromTwoListUsingStream {
    public static void main(String[] args) {

        List<Integer>lItr=List.of(1,1,2,3,4,5,5,4,4,8,8);
        List<String>lStr=List.of("one","Two","Three","Four","Five","Eight");
        int min=Math.min(lItr.size(),lStr.size());

// 	lItr=lItr.stream()
// 	         .distinct()
// 	         .collect(Collectors.toList());



        Map<Integer,String> result=IntStream.iterate(0,i->i<min,i->i+1)
                .boxed()
                .collect(Collectors.toMap(
                        i->lItr.get(i),                  //1st approach using iterator
                        i->lStr.get(i),
                        (existing,next)->next
                ));

        int index[]={0};

        result=lItr.stream()
                .distinct()
                .collect(Collectors.toList())
                .stream()                                  //2nd approach using List.strem
                .limit(Math.min(lItr.size(),lStr.size())) //but is not stateless uses external variable index
                .collect(Collectors.toMap(i->i,
                        i->lStr.get(index[0]++) ));
        System.out.println(result);


    }
}
