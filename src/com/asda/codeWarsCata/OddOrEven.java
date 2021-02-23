package com.asda.codeWarsCata;

public class OddOrEven {
    public static void main(String[] args) {

        System.out.println(oddOrEven(new int[]{11, -20, -30, -40}));
    }

    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum % 2 == 0 ? "even" : "odd";
    }
}
