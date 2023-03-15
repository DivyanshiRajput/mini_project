package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
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
}
