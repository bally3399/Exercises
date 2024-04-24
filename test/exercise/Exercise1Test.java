package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise1Test {
    @Test
    public void testPalindrome() {
        String letter = "madam";
        String expected = "Yes";
        String result = Exercise1.isPalindrome(letter);
        assertEquals(expected, result);
    }
    @Test
    public void testPalindrome1() {
        String letter = "Bally";
        String expected = "No";
        String result = Exercise1.isPalindrome(letter);
        assertEquals(expected, result);
    }
    @Test
    public void testPalindrome2() {
        String letter = "o";
        String expected = "Yes";
        String result = Exercise1.isPalindrome(letter);
        assertEquals(expected, result);
    }
}