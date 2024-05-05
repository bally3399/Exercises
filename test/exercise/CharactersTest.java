package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CharactersTest {
    @Test
    public void testCharacters() {
        String c = "()";
        assertTrue(Characters.isBalanced(c));
    }
    @Test
    public void testCharacters2() {
        String c = "({()})";
        assertTrue(Characters.isBalanced(c));
    }
    @Test
    public void testCharacters3() {
        String c = "{}(";
        assertFalse(Characters.isBalanced(c));
    }

    @Test
    public void testCharacters4() {
        String c = "[]";
        assertTrue(Characters.isBalanced(c));
    }

}
