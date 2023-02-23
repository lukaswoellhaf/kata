package com.codewars.kata.kata_02;

public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        while(!source.isEmpty()) {
            if(!source.substring(1).contains(String.valueOf(source.charAt(0)))) {
                break;
            }
            source = source.replaceAll(String.valueOf(source.charAt(0)), "");
        }
        return source.isEmpty() ? null : source.charAt(0);
      }
}
