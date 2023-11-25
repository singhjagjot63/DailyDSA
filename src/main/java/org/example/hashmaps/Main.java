package org.example.hashmaps;

@FunctionalInterface
interface MyComparator {
    boolean compare(String s1, String s2);
}


public class Main {
    public static void main(String[] args) {

        MyComparator myComparator = (s1,s2)->s1.equals(s2);
        System.out.print(myComparator.compare("jag","jag"));
    }

}
