package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise3Test {
    @Test
    public void convertIntegerToStringTest() {
        int number = 100;
        String expected = "100";
        String result = Exercise3.convertIntegerToString(number);
        assertEquals(expected, result);
    }

}