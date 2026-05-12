package com.gcunosquare;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    private final PalindromeChecker checker = new PalindromeChecker();

    @Test
    void testIsPalindrome() {
        assertTrue(checker.isPalindrome("Radar"));
    }

    @Test
    void testIsNotPalindrome() {
        assertFalse(checker.isPalindrome("This is a test"));
    }

    @Test
    void testIsPalindromeWithSpaces() {
        assertTrue(checker.isPalindrome("Anita lava la tina"));
    }

    @Test
    void testIsPalindromeForEmptyString() {
        assertTrue(checker.isPalindrome(""));
    }

    @Test
    void testIsPalindromeForNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            checker.isPalindrome(null);
        });
    }
}
