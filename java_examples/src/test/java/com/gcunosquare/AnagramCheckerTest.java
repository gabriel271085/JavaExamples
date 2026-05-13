package com.gcunosquare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AnagramCheckerTest {

    private final AnagramChecker checker = new AnagramChecker();

    @Test
    void testIsAnagram() {
        assertTrue(checker.isAnagram("listen", "silent"));
    }

    @Test
    void testIsNotAnagram() {
        assertFalse(checker.isAnagram("hello", "world"));
    }

}
