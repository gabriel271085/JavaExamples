package com.gcunosquare;

public class PalindromeChecker {

     public boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9]","");

        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);

    }
    
}
