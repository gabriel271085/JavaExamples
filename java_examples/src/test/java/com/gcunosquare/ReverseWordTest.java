package com.gcunosquare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseWordTest {

    @Test

    void testReverse() {
        ReverseWord reverseWord = new ReverseWord();
        String result = reverseWord.reverse("This is a test");
        
        assertEquals("tset a si sihT", result);
       
    }

    @Test
    void testReverseEmptyString() {
        ReverseWord reverseWord = new ReverseWord();
        
        assertThrows(IllegalArgumentException.class, () -> {
            reverseWord.reverse("");
        });
    }
    
    @Test
    void testReverseNullString() {
        ReverseWord reverseWord = new ReverseWord();
        
        assertThrows(IllegalArgumentException.class, () -> {
            reverseWord.reverse(null);
        });
    }
    
}
