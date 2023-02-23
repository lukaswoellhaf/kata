package com.codewars.kata;

import com.codewars.kata.kata_01.ChromosomeChecker;
import com.codewars.kata.kata_02.FirstNonRepeated;

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
        ChromosomeChecker.chromosomeCheck("XY");
        FirstNonRepeated.firstNonRepeated("teeter");
    }
}
