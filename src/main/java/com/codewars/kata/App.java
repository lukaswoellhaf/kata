package com.codewars.kata;

import com.codewars.kata.kata_01.ChromosomeChecker;
import com.codewars.kata.kata_02.FirstNonRepeated;
import com.codewars.kata.kata_03.FindOdd;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(ChromosomeChecker.chromosomeCheck("XY"));
        System.out.println(FirstNonRepeated.firstNonRepeated("teeter"));
        System.out.println(FindOdd.findIt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
    }
}
