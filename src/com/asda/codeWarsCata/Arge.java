package com.asda.codeWarsCata;

/**
 * In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases
 * by 2 percent per year and moreover 50 new inhabitants per year
 * come to live in the town. How many years does the town need to see
 * its population greater or equal to p = 1200 inhabitants?
 */

public class Arge {
    public static void main(String[] args) {
        System.out.println(nbYear(1000, 0.02, 50, 1200));
    }

    public static int nbYear(double p0, double percent, int aug, int p) {
        int year = 0;
        while(p0 < p) {
            p0 = p0 + (p0*percent/100)+aug;
            year++;
        }
        return year;
    }
//    Second solution
    public static int nbYear2(int p0, double percent, int aug, int p) {
        if (p0>=p) return 0;
        else return nbYear((int) (p0+aug+p0*(percent/100)), percent, aug, p) + 1;
    }
}
