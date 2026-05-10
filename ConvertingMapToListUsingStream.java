import java.util.*;
import java.util.stream.*;
public class ConvertingMapToListUsingStream {
    public static void main(String[] args) {

        Map<Integer,String> mItrStr= Map.of(1,"One",2,"Two",3,"Three",4,"Four",5,"Five");

        List<String>result=mItrStr.entrySet()
                .stream()
                .map(e->e.getKey()+e.getValue())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
