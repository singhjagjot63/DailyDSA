package org.example.interviewQs;

import java.util.Arrays;
import java.util.stream.Collector;

@FunctionalInterface
interface PowerCalculator {
    int calculatePower(int b, int p);
}
public class PowerFinder {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = (a,b)-> {
            int temp = 1;
            while(b!=0) {
                temp = temp * a;
                b--;
            }
            return temp;
        };
        int result = powerCalculator.calculatePower(2,3);
        System.out.println(result);
    }

}
