package com.codewars.kata.kata_01;

public class ChromosomeChecker {
    public static String chromosomeCheck(String sperm) {
        return sperm.contains("Y") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
      }
}
