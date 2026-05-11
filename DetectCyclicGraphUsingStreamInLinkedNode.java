import java.util.*;
import java.util.stream.*;

public class DetectCyclicGraphUsingStreamInLinkedNode {
    public static void main(String[] args) {

        List<Node>lRel=List.of(new Node(4,5), new Node(4,6),new Node(4,7),new Node(1,4),new Node(1,3),new Node(1,2), new Node(3,4), new Node(7,8),new Node(8,9),new Node(9,1));


        lRel.stream()
                .collect(Collectors.groupingBy(
                        n->n.id,
                        TreeMap::new,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list->list.stream()
                                        .sorted(Comparator.comparing(Node::getNext))
                                        .toList()
                        )
                ))
                .entrySet()
                .stream()


                .forEach(e->System.out.println(e.getKey()+":"+e.getValue()));

    }
}
class Node{
    int id;
    int next;

    Node(int id,int next){
        this.id=id;
        this.next=next;
    }
    int getNext(){
        return next;
    }

    public String toString(){
        return next+"";
    }

}
