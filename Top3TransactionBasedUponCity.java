import java.util.*;
import java.util.stream.*;
public class Top3TransactionBasedUponCity {
    public static void main(String[] args) {

        List<Transaction> transactions= populateList();

        transactions.stream()
                .collect(Collectors.groupingBy(
                        e->e.getCity()
                ))
                .entrySet()
                .stream()
                .forEach(e -> {
                    List<Integer> top3 = e.getValue().stream()
                            .sorted((a, b) -> b.getAmount() - a.getAmount())
                            .limit(3)
                            .map(value->value.getAmount())
                            .collect(Collectors.toList());

                    System.out.println(e.getKey()+" : "+top3);}
                );










    }

    public static List<Transaction> populateList(){
        List<Transaction> transactions=new ArrayList<>(Arrays.asList(
                new Transaction("Bangalore", 500),
                new Transaction("Bangalore", 1200),
                new Transaction("Bangalore", 700),
                new Transaction("Bangalore", 1500),
                new Transaction("Delhi", 300),
                new Transaction("Delhi", 800),
                new Transaction("Delhi", 200),
                new Transaction("Delhi", 1000)
        ));
        return transactions;
    }
}
class Transaction{
    private String city;
    private int amount;

    Transaction(String city, int amount){
        this.city=city;
        this.amount=amount;
    }
    public String getCity(){
        return city;
    }
    public int getAmount(){
        return amount;
    }
    @Override
    public String toString(){
        return "city : "+city+","+"Amount : "+amount;
    }
}
