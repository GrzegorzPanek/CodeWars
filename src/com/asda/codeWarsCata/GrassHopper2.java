package com.asda.codeWarsCata;

/**
 * Complete the function so that it finds the mean of the three scores passed to it and returns the letter value associated with that grade.
 */

public class GrassHopper2 {
    public static void main(String[] args) {
        System.out.println(getGrade(3, 4, 5));

    }
    public static char getGrade(int s1, int s2, int s3) {
        int average = (s1+s2+s3)/3;
        if(average >= 90 && average <= 100) {
            return 'A';
        }else if(average >= 80 && average <= 90) {
            return 'B';
        }else if(average >= 70 && average <= 80) {
            return 'C';
        }else if(average >= 60 && average <= 70) {
            return 'D';
        }else
        return 'F';
    }

    public static char getGrad2(int s1, int s2, int s3) {
        s1=(s1+s2+s3)/3;
        return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
    }
}

