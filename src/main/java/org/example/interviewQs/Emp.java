package org.example.interviewQs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Emp {
//    name, age,salary,address
//    sort records on the basis of age
     String name;
     int age;
     double slalary;
     String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSlalary() {
        return slalary;
    }

    public void setSlalary(double slalary) {
        this.slalary = slalary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Emp emp = new Emp();
        emp.setName("jagjot");
        emp.setAddress("Ghazaiabad");
        emp.setAge(24);
        emp.setSlalary(30000);

        Emp emp1 = new Emp();
        emp1.setName("sup");
        emp1.setAddress("Ghazaiabad");
        emp1.setAge(21);
        emp1.setSlalary(30000);

        Emp emp2 = new Emp();
        emp2.setName("ank");
        emp2.setAddress("Ghazaiabad");
        emp2.setAge(28);
        emp2.setSlalary(30000);

        List<Emp> list = List.of(emp, emp1, emp2);
        list.stream().sorted(Comparator.comparingInt(Emp::getAge)).forEach(System.out::println);
    }
}
