package org.example.interviewQs;

public class StringtoInteger {

    public static int getIntegerValue(String s) {
        String temp = s.strip();
        String result = "";
        for(int i=0;i<temp.length();i++) {
            System.out.println("i is "+i);
            if(temp.charAt(i) == '+' ||
                    temp.charAt(i) == '-' ||
                    temp.charAt(i) == '0' ||
                    temp.charAt(i) == '1' ||
                    temp.charAt(i) == '2' ||
                    temp.charAt(i) == '3' ||
                    temp.charAt(i) == '4' ||
                    temp.charAt(i) == '5' ||
                    temp.charAt(i) == '6' ||
                    temp.charAt(i) == '7' ||
                    temp.charAt(i) == '8' ||
                    temp.charAt(i) == '9') {
                System.out.println("here");
                result = result.concat(String.valueOf(temp.charAt(i)));
            } else if (!Character.isDigit(s.charAt(i))) {
                System.out.println("now herre");
                break;
            }
        }
        int finalRes = 0;
        System.out.println(result);
        if (result.length() == 0) return 0;
        try { finalRes = Integer.parseInt(result);}
        catch(NumberFormatException e) {

        } finally {
            if(finalRes < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else if(finalRes > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else {
                return finalRes;
            }
//            if(result.charAt(0) == '-') {
//                return -2147483648;
//            } else {
//                return 2147483647;
//            }
        }

    }

    public static void main(String[] args) {
        String str = "-91";
        getIntegerValue(str);
    }
}
