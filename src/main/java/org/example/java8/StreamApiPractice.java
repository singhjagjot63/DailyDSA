package org.example.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

class Person {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

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
}

public class StreamApiPractice {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Alice", 17),
                new Person("Michael", 35),
                new Person("Sarah", 20),
                new Person("Sarah", 20)
        );
//        int maxAge = persons.stream().mapToInt(x -> x.getAge()).max().orElse(0);
//        int minAge = persons.stream().mapToInt(x -> x.getAge()).min().orElse(0);
//        double average = persons.stream().mapToInt(x -> x.getAge()).average().orElse(0);
//        System.out.println(maxAge + " " + minAge + " " + average);
//        List<String> names = persons.stream().map(x -> x.getName()).collect(Collectors.toList());
//        Set<String> set = new HashSet<>();
//        List<String> duplicateNames = names.stream().filter(name -> !set.add(name)).collect(Collectors.toList());
//        Map<String, Long> map1 = duplicateNames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        map1.entrySet().stream().forEach(System.out::println);
//        List<Person> p = persons.stream().filter(x->x.getAge() == 23).collect(Collectors.toList());
//        String opt = Optional.ofNullable(p.get(0).getName()).orElse("Anonymous");
//        System.out.println(opt);
        List<Person> collected = persons.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).skip(3).collect(Collectors.toList());
        for(Person p: collected) {
            System.out.println(p.getAge() + " " + p.getName());
        }
    }
}
