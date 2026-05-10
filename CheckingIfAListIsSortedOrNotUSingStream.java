import java.util.*;
import java.util.stream.*;
public class CheckingIfAListIsSortedOrNotUSingStream {
    public static void main(String[] args) {

        List<Integer>lItr=List.of(1,2,3,4,5,7,6);

        int index[]={0};

        boolean result;
        result=lItr.stream()                       // Time taken is O(n^2) due to sorting
                .mapToInt(i->i)
                .sorted()
                .allMatch(i->i==lItr.get(index[0]++));

        result= IntStream.iterate(0,i->i<lItr.size()-1,i->i+1) //Time taken is O(n) worst case scenerio as only n comparsions
                .allMatch(i->lItr.get(i)<=lItr.get(i+1));


        System.out.println(result);
    }
}
