import java.util.*;
import java.util.stream.*;
public class CheckIfAnyStringMatchesACondition {
    public static void main(String[] args) {
        List<String> myList=List.of("helloAPI","myApi","yourApI","none","blank","null");

        myList = myList.stream()
                .map(String::toLowerCase)
                .filter(str->str.contains("api"))
                .collect(Collectors.toList());

        System.out.println(myList);

    }
}
