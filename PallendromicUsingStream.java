import java.util.stream.*;
import java.util.*;
public class PallendromicUsingStream {
    public static void main(String[] args) {

        String[]sarr={"hello","bob","how","are","you","dood","are","you","doing","poop"};

        List<String>result = Arrays.stream(sarr)
                .filter(s->s.equals(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());

        System.out.println(result);


    }
}
