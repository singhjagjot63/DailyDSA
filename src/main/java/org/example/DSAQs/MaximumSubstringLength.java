package org.example.DSAQs;

import java.util.Arrays;

public class MaximumSubstringLength {
    public static void main(String[] args) {
        int maxSubLength = getMaxSubstring(" ");
        System.out.println(maxSubLength);
    }

    public static int getMaxSubstring(String str) {
        int length = str.length();
        int left = 0;
        int maxLength = 0;
        int[] arrayOfChar = new int[121];

        Arrays.fill(arrayOfChar, -1);
        for(int right = 0; right < length; right++) {
            if (arrayOfChar[str.charAt(right)] >= left) {
                left = arrayOfChar[str.charAt(right)] + 1;
            }
            arrayOfChar[str.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}
