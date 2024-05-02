package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionHandling2Test {
    @Test
    public void testExceptionHandling() {
        int n = 3;
        int p = 5;
        try {
            long result = ExceptionHandling2.power(n, p);
            int expected = 243;
            assertEquals(expected, result);
        }catch(Exception e){
            assertEquals(e.getMessage(), "n or p should not be negative.");
        }
    }
    @Test
    public void testExceptionHandling2() {
        int n = 2;
        int p = 4;
        try {
            long result = ExceptionHandling2.power(n, p);
            int expected = 16;
            assertEquals(expected, result);
        }catch(Exception e){
            assertEquals(e.getMessage(), "n or p should not be negative.");
        }
    }
    @Test
    public void testExceptionHandling3() {
        int n = 0;
        int p = 0;
        try {
            long result = ExceptionHandling2.power(n, p);
            int expected = 0;
            assertEquals(expected, result);
        }catch(Exception e){
            assertEquals(e.getMessage(), "n and p should not be zero.");
        }
    }


}
