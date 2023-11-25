package org.example.hashmaps;

public class sample {
    static int i=0;
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
    public static Boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len =  flowerbed.length;
        if(n == 0) {
            return true;
        }

            if(i==0 &&
                    flowerbed[i+1] == 0 &&
                    flowerbed[i] == 0) {
                System.out.println("true condition");
                flowerbed[i] = 1;
                n--;
                i++;
            } else if(i==len &&
                    flowerbed[i-1] == 0) {
                flowerbed[i] = 1;
                n--;
                i++;
            } else if((i+2)<len &&
                    flowerbed[i] == 0 &&
                    flowerbed[i+1] == 0 &&
                    flowerbed[i+2] == 0) {
                System.out.println("Hello");
                flowerbed[i+1] = 1;
                n--;
                i++;
            } else {
                i++;
            }
            if(n != 0) {
                return canPlaceFlowers(flowerbed, n);
            }
        if(n == 0) {
            return true;
        }
        return false;
    }
    }

