import java.util.*;
import java.util.stream.*;
public class CollectingListFromMapUsingStream {
    public static void main(String[] args) {
        Map<String,Integer>mapSI=Map.of("hello",5,"hi",2,"how",3,"are",3,"you",3);

        List<String>result=mapSI.entrySet()
                .stream()
                .filter(entrySet->entrySet.getValue()>=3)
                .map(e->e.getKey())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
