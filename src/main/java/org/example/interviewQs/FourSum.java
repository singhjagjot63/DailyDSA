package org.example.interviewQs;

import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@FunctionalInterface
interface SumOfFour {
    List<Integer> calculateSum(int a, int b, int c, int d);
}

public class FourSum {
    public static void main(String[] args) {
        int[] array = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i< array.length-3;i++) {
            if(i>0 && array[i]==array[i-1]) continue;
            for(int j=i+1;j< array.length-2;j++) {
                if (j>i+1 && array[j]==array[j-1]) continue;

                int k=j+1; int l = array.length-1;
                while (k<l) {
                    int curr_sum = array[i] + array[j] + array[k] + array[l];
                    if(curr_sum == target) {
                        list.add(Arrays.asList(array[i] , array[j] , array[k] , array[l]));
                        while(k>l && array[k]==array[k-1]) k++;
                        while(k>l && array[l]==array[l-1]) l++;
                        k++; l--;
                    } else if (curr_sum > target) {
                        l--;
                    } else  {
                        k++;
                    }
                }
            }
        }
        System.out.println(list);
        String x = "";
        int f = Integer.parseInt(x);
    }
}
