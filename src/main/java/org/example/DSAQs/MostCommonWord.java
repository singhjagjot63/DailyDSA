package org.example.DSAQs;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        List<String> array = List.of(paragraph.toLowerCase().split("[\\s\\p{P}]"));
        Predicate<String> predicate = x-> {
            for(String str:banned) {
                if(x.equals(str)) {
                    return false;
                }
            }
            return true;
        };
        List<String> filter = array.stream().filter(predicate).collect(Collectors.toList());
        for(String s:filter) {
            int count = (int) filter.stream().filter(x->x.equalsIgnoreCase(s.toLowerCase())).count();
            if(map.get(s.toLowerCase()) == null) {
                map.put(s,count);
            } else {
                continue;
            }

        }
        Optional<Map.Entry<String, Integer>> entryWithMaxValue = map.entrySet().stream().max(Map.Entry.comparingByValue());
        return String.valueOf(entryWithMaxValue.get().getKey());
    }


    public static void main(String[] args) {
    System.out.print(mostCommonWord("Bob hit a ball, the hit BALL flew far flew flew after it was hit .", new String[]{"hit","ball"}));
    }
}
