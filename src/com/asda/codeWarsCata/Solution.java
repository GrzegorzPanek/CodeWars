package com.asda.codeWarsCata;

/**
 * Write a program that will calculate the number of trailing zeros in a factorial of a given number.
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(zeros(6));

    }
    public static int zeros(int n) {
        int count = 0;

        while(n != 0) {
            count += n/5;
            n /=5;
        }

        return count;
    }
}
