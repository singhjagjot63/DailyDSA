package org.example.DSAQs;

public class LongestPalindromicSubstring {

    /* My solution

    public String longestPalindrome(String s) {
        String subStr = "";
        boolean palindrone = true;
        String longestPal = "";
        int len = s.length();
        for(int i=0;i<len;i++) {
            int j=len;
            while(j != i) {
                subStr = s.substring(i,j);
                //System.out.println("Substring is "+subStr);
                palindrone = checkPalindrone(subStr);
                if(palindrone) {
                    if(subStr.length() > longestPal.length()) {
                        //System.out.println("Sub stored");
                        longestPal = subStr;
                    }
                }
                j--;
                // System.out.println("J value is " + j);
            }
            //System.out.println("increasing i value");
        }
        return longestPal;

    }

    public Boolean checkPalindrone(String substring) {
        //  System.out.println("Checking for palindrone");
        String rev = "";
        for(int i=substring.length()-1;i>=0;i--) {
            rev = rev + substring.charAt(i);
        }
        // System.out.println("Rev is "+rev);
        if(substring.equals(rev)) {
            return true;
        }
        return false;
    }
    */
     //Leet Code solution
    int maxLen = 0;
    int lo = 0;
    public String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        if(s.length() < 2) {
            return s;
        }

        for(int i = 0; i<input.length; i++) {
            expandPalindrome(input, i, i);
            expandPalindrome(input, i, i+1);
        }
        return s.substring(lo, lo+maxLen);
    }

    public void expandPalindrome(char[] s, int j, int k) {
        while(j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if(maxLen < k - j - 1) {
            maxLen = k - j - 1;
            lo = j+1;
        }
    }
}
