package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    private static final double DELTA = 1e-15;
    App calc = new App();

    @Test
    public void AppTest()
    {
        assertTrue( true );
    }

    @Test
    public void testAdd(){
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testRoot(){
        assertEquals(3.0, calc.squareRoot(9.0), DELTA);
    }
}
