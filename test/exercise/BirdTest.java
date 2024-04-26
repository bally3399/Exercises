package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BirdTest {
    @Test
    public void testBird() {
        Bird bird = new Bird();
        assertEquals("I am flying",bird.fly());
    }
    @Test
    public void testBird2() {
        Bird bird = new Bird();
        assertEquals("I am walking",bird.walk());
    }
    @Test
    public void testBird3() {
        Bird bird = new Bird();
        assertEquals("I am singing",bird.sing());
    }
}