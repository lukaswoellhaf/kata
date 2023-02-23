package com.codewars.kata.kata_02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstNonRepeatedTest {
    @Test
    public void test1() {
        final String input = "test";
        final Character output = FirstNonRepeated.firstNonRepeated(input);
        final Character expected = 'e';
        assertEquals(expected, output);
    }
    
    @Test
    public void test2() {
        final String input = "teeter";
        final Character output = FirstNonRepeated.firstNonRepeated(input);
        final Character expected = 'r';
        assertEquals(expected, output);
    }
    
    @Test
    public void test3() {
        final String input = "1122321235121222";
        final Character output = FirstNonRepeated.firstNonRepeated(input);
        final Character expected = '5';
        assertEquals(expected, output);
    }

    @Test
    public void test4() {
        final String input = "aabbcc";
        final Character output = FirstNonRepeated.firstNonRepeated(input);
        final Character expected = null;
        assertEquals(expected, output);
    }
}
