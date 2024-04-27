package org.example.interviewQs;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateValueFinder {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,2,5,4);
        Set<Integer> set = new HashSet<>();
        List<Integer> leftElem = list.stream().filter(x->!set.add(x)).collect(Collectors.toList());
        System.out.println("Duplicate elemets are " + list);
    }
}
