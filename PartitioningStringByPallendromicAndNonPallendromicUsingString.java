import java.util.*;
import java.util.stream.*;
public class PartitioningStringByPallendromicAndNonPallendromicUsingString {
    public static void main(String[] args) {

        List<String>listS=List.of("Hello","dood","bob","are","you","poop");

        Map<Boolean,List<String>>result=listS.stream()
                .collect(Collectors.partitioningBy(
                        s->s.equals(new StringBuilder(s).reverse().toString())));

        System.out.println(result);

    }
}
