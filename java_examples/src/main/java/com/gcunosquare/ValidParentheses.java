package com.gcunosquare;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String input) {
       if (input == null || input.isEmpty()) {
        throw new IllegalArgumentException("Input cannot be null or empty");
        }

        if (input.isEmpty()) {
            return true; // An empty string is considered valid
        }

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '('|| c == '{' || c == '[') {
                stack.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']') {
                    
                    if (stack.isEmpty()) {
                    return false;
                    }
             
            char open = stack.pop();
            if (!isMatching(open, c)) {
                return false;
                }
            }
            else {
                return false; // Invalid character
            }
            
        }

        return stack.isEmpty();
    }
    
    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '{' && close == '}')
            || (open == '[' && close == ']');
    }    

}
