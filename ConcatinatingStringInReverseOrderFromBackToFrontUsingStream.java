import java.util.*;
import java.util.stream.*;
public class ConcatinatingStringInReverseOrderFromBackToFrontUsingStream {
    public static void main(String[] args) {
        List<String>lStr=List.of("Anna","saw","a", "racecar", "&", "a" ,"kayak","@" ,"noon");

        String result=lStr.stream()
                .reduce("",(a,b)->b+" "+a);



        System.out.println(result.trim());
    }
}
