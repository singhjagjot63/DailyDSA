package org.example.interviewQs;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ArraysMergingUsingStream {


    public static void main(String[] args) {
        int[] arr1 = {1,2,5,4,7,8,11,20};
        //Answer: 2,4,8,20,1,5,7,11
        IntPredicate predicateEven = x->x%2==0;
        IntPredicate predicateOdd = x->x%2!=0;
        int[] firstPart = Arrays.stream(arr1).filter(predicateEven).toArray();
        int[] secondPart = Arrays.stream(arr1).filter(predicateOdd).toArray();
        int[] merged = IntStream.concat(IntStream.of(firstPart), IntStream.of(secondPart)).toArray();
    }
}
