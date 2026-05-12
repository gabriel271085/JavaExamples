package com.gcunosquare;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    private final ValidParentheses validator = new ValidParentheses();

    @Test
    void testValidSimpleParentheses() {
        assertTrue(validator.isValid("()"));
    }

    @Test
    void testValidMultipleTypes() {
        assertTrue(validator.isValid("()[]{}"));
    }

    @Test
    void testValidNested() {
        assertTrue(validator.isValid("{[]}"));
    }

    @Test
    void testInvalidMismatch() {
        assertFalse(validator.isValid("(]"));
    }

    @Test
    void testInvalidOrder() {
        assertFalse(validator.isValid("([)]"));
    }

    @Test
    void testOnlyOpening() {
        assertFalse(validator.isValid("((("));
    }

    @Test
    void testOnlyClosing() {
        assertFalse(validator.isValid("]]]"));
    }

    @Test
    void testEmptyStringThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.isValid("");
        });
    }

    @Test
    void testNullThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.isValid(null);
        });
    }
}