package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubStringTest {
    @Test
    public void testSubstring() {
        String word = "helloworld";
        int start = 3;
        int end = 7;
        assertEquals("lowo", SubString.printSubstring(word, start, end));
    }
    @Test
    public void testSubstring1() {
        String word = "semicolon";
        int start = 3;
        int end = 7;
        assertEquals("icol", SubString.printSubstring(word, start, end));
    }
}
