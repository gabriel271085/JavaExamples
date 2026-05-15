package com.gcunosquare;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    
    public String removeDuplicates(String input) {
        if(input == null){
            throw new IllegalArgumentException("Input string cannot be null");
        }

        Set<Character> uniqueCharacters = new LinkedHashSet<>();

        for (char character : input.toCharArray()) {
            uniqueCharacters.add(character);
        }

        StringBuilder result = new StringBuilder();

        for (char character : uniqueCharacters) {
            result.append(character);
        }

        return result.toString();
    }
}
