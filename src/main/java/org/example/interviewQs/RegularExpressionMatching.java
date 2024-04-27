package org.example.interviewQs;

public class RegularExpressionMatching {

    public static boolean checkMatching(String s, String p) {
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        boolean temp = false;
        int cases = -1;
        if(p.contains("*") && p.contains(".")) {
            cases = 0;
        } else if(p.contains("*")) {
            cases = 1;
        } else if(p.contains(".")) {
            cases = 2;
        } else {
            cases =3;
        }
        switch (cases) {
            case 0:
                int i=0; int j=0;
                while(i<s.length() || j< p.length()) {
                    if(sArr[i] == pArr[j]) {
                        temp = true;
                        i++;j++;
                    } else if(pArr[j] == '*' && (sArr[i] == sArr[i-1] || pArr[j-1] == '.')) {
                        temp = true;
                        if(j == p.length()) {
                            i++;
                        } else {
                        i++; j++;}
                    } else if(pArr[j] == '.') {
                        temp = true;
                        i++; j++;
                    } else {
                        temp = false;
                    }
                }
                break;
            case 1:
                int x=0; int y=0;
                while(x<s.length() || y< p.length()) {
                    if(sArr[x] == pArr[y]) {
                        temp = true;
                        x++;y++;
                    } else if(pArr[y] == '*' && (sArr[x] == sArr[x-1])) {
                        temp = true;
                        if(y == p.length()-1) {
                            x++;
                        } else {
                            x++; y++;}
                    } else {
                        temp = false;
                        x++; y++;
                    }
                }
                break;
            case 2:
                int k=0; int l=0;
                while(k<s.length() || l< p.length()) {
                    if(sArr[k] == pArr[l]) {
                        temp = true;
                        k++;l++;
                    } else if(pArr[l] == '.') {
                        temp = true;
                        if(l == p.length()-1) {
                            k++;
                        } else {
                            k++; l++;}
                    } else {
                        temp = false;
                        break;
                    }
                }
                break;
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = "ab";
        String  p = ".*";
        boolean result = checkMatching(s,p);
    }
}
