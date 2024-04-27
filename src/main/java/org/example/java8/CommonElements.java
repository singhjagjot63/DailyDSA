package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main(String[] args) {
        //Out of two arrays find the common elements
        int[] arr1 = {1,2,3,4,5,6,8};
        int[] arr2 = {3,4,5,6,9,8};

        List<Integer> lst = Arrays.stream(arr1).filter(x->Arrays.stream(arr2).anyMatch(y->y==x)).
                boxed().collect(Collectors.toList());
        System.out.println(lst);
    }
}
