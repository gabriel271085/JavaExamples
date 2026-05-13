package com.gcunosquare;
import java.util.Arrays;

public class AnagramChecker {

    public boolean isAnagram(String first, String second){

        first = first.toLowerCase();
        second = second.toLowerCase();

        if(first.length() != second.length()){
            return false;
        }

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();


        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        return Arrays.equals(firstChars, secondChars);
    }
    
}
