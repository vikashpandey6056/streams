import java.util.*;
import java.util.stream.*;
public class LongestStringInASentenceUsingStream {
    public static void main(String[] args) {

        String str="hello boy are you man are you doing good, yeah all fine by me here";
        String result=Arrays.stream(str.split("[,. ]"))
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst()
                .orElse(null);

        System.out.println(result);


        str="phenumonultramicroscopicsilicovolcanoconiosis";
        result=Arrays.stream(str.split("[,. ]"))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println(result);
    }
}
