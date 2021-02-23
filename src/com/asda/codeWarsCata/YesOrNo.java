package com.asda.codeWarsCata;

/**
 * Convert boolean values to strings 'Yes' or 'No'.
 */

public class YesOrNo {
    public static void main(String[] args) {
        boolToWord(true);
    }

    public static String boolToWord (boolean b) {
        if (b) {
            return "Yes";
        }else {
            return "No";
        }
    }

    public static String boolWord(boolean b) {
        return b ? "Yes" : "No";
    }
}
