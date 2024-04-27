package org.example.interviewQs;

import java.util.HashMap;
import java.util.Hashtable;

public class StringClass {
    static StringClass stringClass = new StringClass();
    public static void abc() {
        System.out.println(stringClass.getClass().getClassLoader());
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashtable = new HashMap<>();
        hashtable.put(null, 0);
        System.out.println(hashtable.toString());
    }
}
