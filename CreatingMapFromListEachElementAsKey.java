import java.util.*;
import java.util.stream.*;
public class CreatingMapFromListEachElementAsKey {	public static void main(String[] args) {

    List<String> lstr=List.of("hello","world","how","are","you","are","you","doing","good");

    Map<String,Integer>result=lstr.stream()
            .collect(Collectors.toMap(
                    s->s,
                    s->s.length(),
                    (a,b)->a
            ));

    System.out.println(result);

}
}
