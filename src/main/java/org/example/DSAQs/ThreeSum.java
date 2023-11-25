package org.example.DSAQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3; int n = 3;
        nums1 = Arrays.stream(nums1).limit(m).toArray();
        nums2 = Arrays.stream(nums2).limit(n).toArray();
        nums1 = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).sorted().toArray();
    }
}
