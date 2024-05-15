package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCompareTest {
    @Test
    public void testStringCompare() {
        String a = "welcometojava";
        int b = 3;
        String c = StringCompare.getSmallestAndLargest(a, b);
        String[] part = c.split("\n");
        assertEquals( "ava", part[0]);
        assertEquals( "wel", part[1]);
    }

    @Test
    public void testStringCompare1() {
        String a = "welcometojava";
        int b = 4;
        String c = StringCompare.getSmallestAndLargest(a, b);
        String[] part = c.split("\n");
        assertEquals( "come", part[0]);
        assertEquals( "welc", part[1]);
    }
}
