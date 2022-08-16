package reports;

import entities.*;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BusinessReport {
    public static Map<Disability, List<Employee>> getEmployeesOnSameDisability(Business business) {
        // Get employees and map them on the type of disability they possess
        List<Employee>employees=List.copyOf( business.getEmployees());
        return employees.stream().collect(Collectors.groupingBy(Employee::getDisability));

    }

    public static long getNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees(Business business) {
        // Get employees, filter by gender, get their projects without duplicates, count

       List<Project>projects=
               List.copyOf(business.getEmployees())
               .stream()
               .filter(employee -> employee.getGender().equals(Gender.FEMALE))
               .map(employee->employee.getProjects())
               .flatMap(List::stream)
               .distinct()
               .collect(Collectors.toList());
       return projects.size();
    }

    public static Map<Religion, Map<Gender, List<Employee>>> getEmployeesOnSameReligionAndGender(Business business) {
        // Map the employees by religion (Map<Religion, List<Employee>>)
        // then map each of the lists by city (Map<String, List<Employee>>)
        // Hint: use Collectors.groupingBy(Function, Collector)
        Map<Gender, List<Employee>>firstMap=
                List.copyOf(business.getEmployees())
                .stream().collect(
                        Collectors.groupingBy((Employee emp) -> emp.getGender()));
        Map<Religion, Map<Gender, List<Employee>>>secondMap=new HashMap<>();
        return secondMap;

    }
}
