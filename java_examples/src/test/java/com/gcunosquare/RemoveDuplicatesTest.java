package com.gcunosquare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    private final RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    void testRemoveDuplicates() {
        String input = "hello world";
        String expected = "helo wrd";
        String actual = removeDuplicates.removeDuplicates(input);
        assertEquals(expected, actual);
    }    

    @Test
    void  testRemoveDuplicateswithMixedCharacters() {
        assertEquals("abc123", removeDuplicates.removeDuplicates("aabbcc112233"));
    }
    @Test
    void testRemoveDuplicatesWithEmptyString() {
        assertEquals("", removeDuplicates.removeDuplicates(""));
    }
    @Test
    void testRemoveDuplicatesWithNull() {
        assertThrows(IllegalArgumentException.class, () -> removeDuplicates.removeDuplicates(null));
    }
    
}
