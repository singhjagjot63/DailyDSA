package org.example.hashmaps;

public class IntegerToRoman {

    static String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    static String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    static String[] hrns = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    static String[] ths = {"","M","MM","MMM"};
    public static String getRoman(int num) {
        return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[(num%10)];
    }

    public static void main(String[] args) {
        System.out.println(getRoman(240));
    }
}
