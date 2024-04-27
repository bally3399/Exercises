package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderTest {
    @Test
    public void testAdder() {
        int number = 25;
        int num = 25;
        assertEquals(50, Adder.add(number, num));
    }
    @Test
    public void testAddNegativeTogether() {
        int number = -25;
        int num = -25;
        assertEquals(-50, Adder.add(number, num));
    }
    @Test
    public void testAddNegativeAndPositiveTogether() {
        int number = -25;
        int num = 25;
        assertEquals(0, Adder.add(number, num));
    }
    @Test
    public void testAddPositiveTestTogether2() {
        int number = 55;
        int num = 25;
        assertEquals(80, Adder.add(number, num));
    }
}
