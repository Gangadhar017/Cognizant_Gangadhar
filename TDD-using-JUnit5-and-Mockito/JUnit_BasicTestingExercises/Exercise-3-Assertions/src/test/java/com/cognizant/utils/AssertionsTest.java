package com.cognizant.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionsTest {

    Calculator calculator = new Calculator();

    @Test
    void testAssertions() {

        // assertEquals
        assertEquals(5, calculator.add(2, 3));

        // assertNotEquals
        assertNotEquals(6, calculator.add(2, 3));

        // assertTrue
        assertTrue(10 > 5);

        // assertFalse
        assertFalse(5 > 10);

        // assertNull
        String name = null;
        assertNull(name);

        // assertNotNull
        Calculator calc = new Calculator();
        assertNotNull(calc);

        // assertSame
        Calculator c1 = calc;
        assertSame(calc, c1);

        // assertNotSame
        Calculator c2 = new Calculator();
        assertNotSame(calc, c2);

        // assertArrayEquals
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);

    }

}
