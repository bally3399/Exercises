package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigNumberTest {
    @Test
    public void testBigNumber() {
        BigNumber bigNumber = new BigNumber();
        String number = "1234";
        String add = "20";
        assertEquals("1254", bigNumber.add(number, add));
    }

    @Test
    public void testBigNumber2() {
        BigNumber bigNumber = new BigNumber();
        String number = "1234";
        String add = "20";
        assertEquals("24680", bigNumber.multiply(number, add));
    }
}