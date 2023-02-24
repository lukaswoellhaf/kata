package com.codewars.kata.kata_03;

import java.util.Arrays;

public class FindOdd {

    public static int findIt(int[] a) {
        int oddValue = 0;
        for (Integer value : a) {
            long counter = Arrays.stream(a).filter(number -> number == value).count();
            if (!(counter % 2 == 0)) {
                oddValue = value;
                break;
            }
        }
        return oddValue;
    }
}
