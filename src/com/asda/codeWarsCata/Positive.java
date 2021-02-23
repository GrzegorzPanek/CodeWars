package com.asda.codeWarsCata;

import java.util.Arrays;

/**
 * You get an array of numbers, return the sum of all of the positives ones.
 */

public class Positive {
    public static void main(String[] args) {

        sum(new int[]{0, 10, 15, 20, 25});
        System.out.println(sum2(new int[]{0, 10, 15, 20, 25}));
    }

    public static int sum(int[] arr) {
        int suma = 0;
        for (int i : arr) {
            if (i > 0) {
                suma += i;
            }
        }
        return suma;
    }

        public static int sum2(int[] arr){
            return Arrays.stream(arr).filter(v -> v > 0).sum();
        }
}



