package org.example.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LengthOfLongestString {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Avocado", "Apricot","Grapes","sdbjcjksbkbd");
        int max = list.stream().mapToInt(x->x.length()).max().orElse(0);
        System.out.println(max);
    }
}
