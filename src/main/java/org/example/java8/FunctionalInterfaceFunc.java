package org.example.java8;

@FunctionalInterface
 interface StringModifier {
    int compare(String str1, String str2);
}

public class FunctionalInterfaceFunc {
    public static void main(String[] args) {
         StringModifier stringModifier = String::compareTo;
         int res = stringModifier.compare("Jagjot","JAGJOT");
        System.out.println(res);
    }
}
