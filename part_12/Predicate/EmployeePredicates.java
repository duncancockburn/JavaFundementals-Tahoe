package part_12.Predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {


    public Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
    }

    public Predicate<Employee> isAgeMoreThan(Integer age) {
        return p -> p.getAge() > age;
    }


    public List<Employee> filterEmployees(Predicate<Employee> predicate) {
        return filterEmployees(predicate).stream().filter(predicate).collect(Collectors.<Employee>toList());

    }
}

