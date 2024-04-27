package org.example.interviewQs;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employeeObj1 = new Employee();
        Employee employeeObj2 = new Employee();
        Employee employeeObj3 = new Employee();
        employeeObj1.setName("Jagjot");
        employeeObj1.setGender("male");
        employeeObj1.setSalary((double)50000);
        employeeObj1.setAge(24);
        employeeObj1.setId(2366);

        employeeObj2.setName("Harleen");
        employeeObj2.setGender("female");
        employeeObj2.setSalary((double)30000);
        employeeObj2.setAge(22);
        employeeObj2.setId(2369);

        employeeObj3.setName("Jasleen");
        employeeObj3.setGender("female");
        employeeObj3.setSalary((double)23000);
        employeeObj3.setAge(28);
        employeeObj3.setId(2169);
        List<Employee> empList = List.of(employeeObj1, employeeObj2, employeeObj3);
        Map<String, Double> map = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Males are " + map.get("male"));
        System.out.println("Females are " + map.get("female"));
        List<Employee> sortedList = empList.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        for(Employee em:sortedList) {
            System.out.println(em.age);
        }
        long males = empList.stream().filter(x->x.getGender().equals("male")).count();
        long females = empList.stream().filter(x->x.getGender().equals("female")).count();
    }
}
