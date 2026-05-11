import java.util.*;
import java.util.stream.*;
public class GroupEmployeeBasedUponDepartmentFirstThenBasedUponAgeUsingStream {

    public static void main(String[] args) {

        List<employee>lEmp=List.of(
                new employee("abc",27,"unicorn"),
                new employee("def",25,"mnc"),
                new employee("ghi",24,"mnc"),
                new employee("jkl",26,"unicorn"),
                new employee("mno",25,"mnc"),
                new employee("pqr",25,"business"),
                new employee("stu",27,"unicorn"),
                new employee("vwx",24,"mnc"),
                new employee("yz",25,"business")
        );


        Map<String,Map<Integer,List<employee>>> empGrouping=lEmp.stream()
                .collect(Collectors.groupingBy(
                        employee->employee.getDepartment(),
                        Collectors.groupingBy(
                                emp->emp.getAge())));

        System.out.println(empGrouping);

        empGrouping.entrySet()
                .stream()
                .forEach(e->{System.out.print("{"+e.getKey());
                    e.getValue()
                            .entrySet()
                            .stream()
                            .forEach(ken->{
                                System.out.print(" : "+ken.getKey()+" [");
                                ken.getValue()
                                        .stream()
                                        .forEach(ke-> System.out.print(ke.getName()+" "));
                                System.out.print("]");});
                    System.out.println("}"); });


    }
}
class employee{
    String name;
    int age;
    String department;

    employee(String name,int age, String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getDepartment(){
        return department;
    }

    @Override
    public String toString(){
        return name;
    }
}
