package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 4, 8, 7};
        int[] arr2 = new int[]{1, 5, 0, 7}; //0,1,4,5,5,7,7,8
        double median = findMedianOfTwoSortedArrays(arr1, arr2);
        System.out.println("Median is " + median);
    }

    public static double findMedianOfTwoSortedArrays(int[] nums1,
                                                     int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Double.valueOf(nums1[i]));
        }
        for (int j = 0; j < m; j++) {
            list.add(Double.valueOf(nums2[j]));
        }
        List<Double> sortedList = list.stream().sorted().
                collect(Collectors.toList());
        int listSize = sortedList.size();
        if (listSize % 2 != 0) {
            return sortedList.get(listSize / 2);
        } else {
            int s1 = listSize / 2;
            int s2 = s1 - 1;
            return (sortedList.get(s1) + sortedList.get(s2)) / 2;
        }
    }
}
