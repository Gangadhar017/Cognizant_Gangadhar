package com.cognizant.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2, 3));

    }

}
