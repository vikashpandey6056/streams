import java.util.*;
import java.util.stream.*;
public class MedianOfListOfIntegerUsingStream {

    public static void main(String[] args) {
        List<Integer>lIstr=List.of(1,2,3,4,5,6,7,8,9,10);
        lIstr=lIstr.stream()
                .sorted()
                .collect(Collectors.toList());

        int size=lIstr.size();
        double median=0;
        if(size%2==0){
            median=(lIstr.get(size/2)+lIstr.get(size/2-1))/2;
        }else{
            median=lIstr.get(size/2);
        }
        System.out.println(median);

        System.out.println(lIstr.get(size/2));
        System.out.println(lIstr.get(size/2-1));
    }
}
