package org.example.java8;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;

    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeData {
   public static List<Employee> addData() {
       List<Employee> list = new ArrayList<>();
       list.add(new Employee(111, "Jiya",32,"Female","HR",2011,25000.0));
       list.add(new Employee(111, "Jiya", 32, "Female", "HR", 2011, 25000.0));
       list.add(new Employee(112, "Amit", 28, "Male", "Finance", 2013, 28000.0));
       list.add(new Employee(113, "Priya", 35, "Female", "Marketing", 2010, 26000.0));
       list.add(new Employee(114, "Rahul", 30, "Male", "IT", 2012, 27000.0));
       list.add(new Employee(115, "Anjali", 29, "Female", "Sales", 2014, 29000.0));
       list.add(new Employee(116, "Mohit", 33, "Male", "Operations", 2009, 25500.0));
       list.add(new Employee(117, "Neha", 31, "Female", "HR", 2015, 26500.0));
       list.add(new Employee(118, "Karan", 27, "Male", "Finance", 2016, 27500.0));
       list.add(new Employee(119, "Pooja", 34, "Female", "Marketing", 2008, 26000.0));
       list.add(new Employee(120, "Sumit", 26, "Male", "Sales", 2017, 28500.0));
       return  list;
   }

    public static void main(String[] args) {
        List<Employee> newList = addData();
        long femaleCount = newList.stream().filter(x->x.getGender().equalsIgnoreCase("Female")).count();
        long maleCount = newList.stream().filter(x->x.getGender().equalsIgnoreCase("Male")).count();
        System.out.println("Female count " + femaleCount + " and Male count " + maleCount);
        newList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
    }

}
