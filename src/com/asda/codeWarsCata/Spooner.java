package com.asda.codeWarsCata;


import java.util.Random;

public class Spooner {

    public static String spoonerize(String words) {
        String[] newWords = words.split(" ");
        return newWords[1].substring(0, 1) + newWords[0].substring(1) + " " + newWords[0].substring(0, 1) + newWords[1].substring(1);
    }
}
