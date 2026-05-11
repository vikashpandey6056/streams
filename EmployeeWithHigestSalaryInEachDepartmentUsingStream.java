import java.util.*;
import java.util.stream.*;
public class EmployeeWithHigestSalaryInEachDepartmentUsingStream {

    public static void main(String[] args) {
        List<Employee> lEmp =List.of(
                new Employee("abhay","Account",60000),
                new Employee("Rohan","Account",70000),
                new Employee("vikash","IT",100000),
                new Employee("gandhi","Security",50000),
                new Employee("sunny","Security",40000),
                new Employee("Reddy","IT",80000),
                new Employee("shweta","HR",90000),
                new Employee("surikiti","Security",45000));

        Map<String,Employee> result= lEmp.stream()
                .collect(Collectors.groupingBy(
                        e->e.getDepartment()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue()
                                .stream()
                                .max(Comparator.comparing(Employee::getSalary))
                                .orElse(null)));
        System.out.println(result);


    }
}
class Employee
{
    String name;
    String department;
    int salary;
    Employee(String name, String department, int salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    String getName(){
        return name;
    }
    String getDepartment(){
        return department;
    }
    int getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return name;
    }
}

