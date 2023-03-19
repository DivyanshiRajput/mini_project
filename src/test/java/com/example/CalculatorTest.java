package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest 
{
    private static final double DELTA = 1e-15;

    @Test
    public void testRoot(){
        assertEquals(3.0, Calculator.squareRoot(9.0), DELTA);
    }

    @Test
    public void testFactorial(){
        assertEquals(120.0, Calculator.factorial(5), DELTA);
    }

    @Test
    public void testLog(){
        // assertEquals(2.302, Calculator.log(10), DELTA);
        assertEquals(0.0, Calculator.log(1), DELTA);
    }

    @Test
    public void testExponential(){
        assertEquals(1, Calculator.exponential(5, 0), DELTA);
    }
}
