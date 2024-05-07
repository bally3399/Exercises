package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyFormatterTest {
    @Test
    public void testFormat() {
        double payment = 12324.134;
        String us = CurrencyFormatter.usFormat(payment);
        assertEquals("$12,324.13", us);
    }

    @Test
    public void testFormat2() {
        double payment = 12324.134;
        String india = CurrencyFormatter.inFormat(payment);
        assertEquals("₹12,324.13", india);
    }

    @Test
    public void testFormat3() {
        double payment = 12324.134;
        String china = CurrencyFormatter.chinaFormat(payment);
        assertEquals("¥12,324.13", china);
    }@Test
    public void testFormat4() {
        double payment = 12324.134;
        String france = CurrencyFormatter.franceFormat(payment);
        assertEquals("12 324,13 €", france);
    }
}
