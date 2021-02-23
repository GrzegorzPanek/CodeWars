package com.asda.codeWarsCata;

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquares {
    public static void main(String[] args) {
        System.out.println(sqInRect(15, 20));
    }

    public static List<Integer> sqInRect(int lenght, int width) {
        List<Integer> result = new ArrayList<>();
        while (lenght != width) {
            if (lenght > width) {
                lenght = lenght - width;
                result.add(width);
            } else {
                width = width - lenght;
                result.add(lenght);
            }
        }
        if (result.size() > 0) {
            result.add(lenght);
            return result;
        } else {
            return null;
        }
    }
}


