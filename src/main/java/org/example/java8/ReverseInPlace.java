package org.example.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

@FunctionalInterface
interface ReverseString {
    String getString(String str);
}

public class ReverseInPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8};
        IntStream.range(0, arr.length/2).forEach(i->{
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length -i -1] = temp;
        });
        System.out.println(Arrays.toString(arr));

        ReverseString reverseString = x-> {
            String temp = "";


            for(int i=x.length()-1;i>=0;i--) {
                temp = temp.concat(String.valueOf(x.charAt(i)));
            }
            return temp;
        };

        System.out.println(reverseString.getString("Jagjot"));
    }
}
