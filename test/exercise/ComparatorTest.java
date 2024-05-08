package exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparatorTest {
    @Test
    public void testCompare_SameScore() {
        Checker checker = new Checker();
        Player player1 = new Player("amy", 100);
        Player player2 = new Player("david", 100);
        int result = checker.compare(player1, player2);
        int expected = -3;
        assertEquals(expected, result);
    }
    @Test
    public void testCompare_DifferentScore() {
        Checker checker = new Checker();
        Player player1 = new Player("amy", 50);
        Player player2 = new Player("david", 100);
        int result = checker.compare(player1, player2);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void testCompare_sameScore() {
        Checker checker = new Checker();
        Player player1 = new Player("aakansha ",100);
        Player player2 = new Player("paul", 100);
        int result = checker.compare(player1, player2);
        int expected = -15;
        assertEquals(expected, result);
    }
}

