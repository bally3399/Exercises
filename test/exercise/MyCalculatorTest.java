package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {
    @Test
    public void testThatCalculatorReturnSumOfNumberDivisor() {
        MyCalculator myCalculator = new MyCalculator();
        int number = 6;
        assertEquals(12, myCalculator.divisorSum(number));
    }
    @Test
    public void testThatCalculatorReturnSumOfDivisorsOf12() {
        MyCalculator myCalculator = new MyCalculator();
        int number = 12;
        assertEquals(28, myCalculator.divisorSum(number));
    }


}