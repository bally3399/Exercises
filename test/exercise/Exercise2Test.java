package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {
    @Test
    public void testThaTwoStringsAreAnagram() {
        String arr = "CAT";
        String arr1 = "act";
        assertTrue(Exercise2.isAnagram(arr, arr1));


    }
    @Test
    public void testForTwoStrings_NotAnagram() {
        String arr = "food";
        String arr1 = "offd";
        assertFalse(Exercise2.isAnagram(arr, arr1));

    }
    @Test
    public void testTwoStringsWithDifferentLength_NotAnagram() {
        String arr = "catt";
        String arr1 = "act";
        assertFalse(Exercise2.isAnagram(arr, arr1));
    }
}