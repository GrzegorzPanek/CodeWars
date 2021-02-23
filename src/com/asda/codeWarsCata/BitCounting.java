package com.asda.codeWarsCata;

/**
 *
 Write a function that takes an integer as input, and returns the number of
 bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
 */

public class BitCounting {
    public static void main(String[] args) {

        System.out.println(countBits(200));
        System.out.println("=================");
        System.out.println(countBits2(12313));
    }


    public static int countBits (int number) {
        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    public static int countBits2 (int number) {
        return Integer.bitCount(number);
    }
}
