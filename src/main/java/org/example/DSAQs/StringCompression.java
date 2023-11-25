package org.example.DSAQs;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {
    public static int getCompressedResult(char[] chars) {
        char first = chars[0];

        String result = "";
        int ctr = 0;
        for(int i=0;i< chars.length;i++) {
            if(first == chars[i]) {
                ctr++;
                if(i == chars.length-1) {
                    result = result.concat(String.valueOf(first)).concat(String.valueOf(ctr));
                }
            } else {
                result = result.concat(String.valueOf(first)).concat(String.valueOf(ctr));
                ctr = 1;
                first = chars[i];
            }
        }

        return result.replace("1","").length();
    }
    public static void main(String[] args) {
        char[] chars = {'a','b','b','c','c','c'};
    getCompressedResult(chars);
    }
}

