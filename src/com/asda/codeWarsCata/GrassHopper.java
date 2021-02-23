package com.asda.codeWarsCata;

/**
 * Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
 */

public class GrassHopper {
    public static void main(String[] args) {
        System.out.println(summation(10));
    }

    public static int summation(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

//    Second solution
    public static int summation2(int n) {

        return  n*(n+1)/2;
    }
}
