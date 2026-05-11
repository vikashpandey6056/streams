import java.util.*;
import java.util.stream.*;
public class TopNElementUsingMinHeapAndStream {
    public static void main(String[] args) {
        List<Integer>litr=List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        Stream<Integer> lItrStrm=litr.stream();
        int n=10;

        PriorityQueue<Integer>result=new PriorityQueue<>();

        lItrStrm
                .forEach(e->{if(result.size()<n)
                {
                    result.offer(e);
                }
                else{
                    if(result.peek()<e){
                        result.poll();
                        result.offer(e);
                    }
                }
                });

        System.out.println(result.size());
        result.stream()
                .forEach(e->System.out.print(e+" "));


    }
}
