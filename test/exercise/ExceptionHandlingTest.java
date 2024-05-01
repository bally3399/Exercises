package exercise;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionHandlingTest {
    @Test
    public void testExceptionHandling() {
        int a = 10;
        int b = 3;
        int result =ExceptionHandling.exception(a,b);
        int expected = 3;
        try {
            assertEquals(expected, result);
        }catch (InputMismatchException e) {
            assertEquals(e.getMessage(), "java.util.InputMismatchException");
        }

    }
    @Test
    public void testExceptionHandling2() {
        try{
            int a = 10;
            int b = 0;
            int result =ExceptionHandling.exception(a,b);
            assertEquals("java.lang.ArithmeticException: / by zero", result);
        }catch (ArithmeticException e) {
            assertEquals(e.getMessage(), "java.lang.ArithmeticException: / by zero");
        }
    }
}
