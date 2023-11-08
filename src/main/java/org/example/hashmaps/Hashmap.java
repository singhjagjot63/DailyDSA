package org.example.hashmaps;

import java.util.HashMap;
import java.util.HashSet;

//Implementation of
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Jagjot", 45);
        map.put("Snow", 47);
        map.put("Stacy", 50);
        System.out.println(map.containsKey("Jagjot"));

        //Hashset always prints unique values
        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(21);
        set.add(21);
        set.add(64);
        set.add(32);
        System.out.println(set);
    }
}
