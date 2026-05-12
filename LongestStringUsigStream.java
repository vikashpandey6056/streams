import java.util.*;
import java.util.stream.*;
public class LongestStringUsigStream {	public static void main(String[] args) {
    String[] arrStr={"hello","boy","how","are","you","man"};

    String result=	Arrays.stream(arrStr)
            .sorted((str1,str2)->str2.length()-str1.length())
            .findFirst()
            .orElse("");
    String result1=Arrays.stream(arrStr)
            .sorted(Comparator.comparingInt(String::length).reversed())
            .findFirst()
            .orElse("");
    System.out.println(result1);
    System.out.println(result);
}
}
