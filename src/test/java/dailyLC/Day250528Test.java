package dailyLC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day250528Test {

    Day250528 obj = new Day250528();

    @Test
    void testBasicCase() {
        assertEquals(110, obj.differenceOfSums(20, 5));
    }

    @Test
    void testNoneDivisible() {
        assertEquals(6, obj.differenceOfSums(3, 5));
    }

    @Test
    void testAllDivisible() {
        assertEquals(-15, obj.differenceOfSums(5, 1));
    }


    @Test
    void testNEqualsM() {
        assertEquals(5, obj.differenceOfSums(5, 5));
    }

}
