package com.codewars.kata.kata_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ChromosomeCheckerTest {
    
    @Test
    void testChromosomeChecker() {
        assertEquals("Congratulations! You're going to have a son.", ChromosomeChecker.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", ChromosomeChecker.chromosomeCheck("XX"));
    }
}
