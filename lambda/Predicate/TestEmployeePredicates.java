package lambda.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lambda.Predicate.Employee.isAdultFemale;
import static lambda.Predicate.Employee.isAdultMale;

public class TestEmployeePredicates {
    public void main(String[] args) {

        EmployeePredicates object = new EmployeePredicates();

        Employee e1 = new Employee(1, 23, "M", "Rick", "Beethovan");
        Employee e2 = new Employee(2, 13, "F", "Martina", "Hengis");
        Employee e3 = new Employee(3, 43, "M", "Ricky", "Martin");



        List<Employee> employees = new ArrayList<Employee>();


        employees.addAll(Arrays.asList(new Employee[]{e1, e2, e3, }));

        System.out.println(object.filterEmployees(isAdultMale()));

        System.out.println(object.filterEmployees(isAdultFemale()));

        System.out.println(object.isAgeMoreThan(35));

        System.out.println(object.isAgeMoreThan(35).negate());
    }
}
