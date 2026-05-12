package com.gcunosquare;

public class ReverseWord {

    public String reverse(String input) {

        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
    }
        return new StringBuilder(input).reverse().toString();
      
    }

}
