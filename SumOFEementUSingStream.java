import java.util.*;
import java.util.stream.*;
public class SumOFEementUSingStream {	public static void main(String[] args) {

    List<Integer> myListInter=List.of(1,3,2,4,5,7,6,8,0,9);

    int sumI=myListInter.stream()
            .mapToInt(Integer::intValue)
            .sum();

    System.out.println(sumI);

    List<Long> myListLong=List.of(1L,3L,4L,5L,6L,7L,8L,9L,0L);

    Long sumL=myListLong.stream()
            .mapToLong(Long::longValue)
            .sum();

    System.out.println(sumL);

    List<Double> myListDouble=List.of(1.0,2.0,3.0,5.0,4.0,7.0,8.0,9.1,10.0,9.0,8.1,9.0);

    Double sumD=myListDouble.stream()
            .mapToDouble(Double::doubleValue)
            .sum();

    System.out.println(sumD);

    List<Character> myListChar=List.of('a','b','c');
    String sumC = myListChar.stream()
            .map(String::valueOf)
            .reduce("", (a, b) -> a + b);
    System.out.println(sumC);

    String sumC2=myListChar.stream()
            .map(String::valueOf)
            .collect(Collectors.joining());

    System.out.println(sumC2);

}
}
