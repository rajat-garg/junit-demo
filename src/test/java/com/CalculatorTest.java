package com;



import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by RajatGarg on 3/7/2017.
 */
public class CalculatorTest {
    @Test
    public void testAddPass() {
        assertEquals("Error in addition()", 3, Calculator.add(1, 2));
        assertEquals("Error in addition()", -3, Calculator.add(-1, -2));
        assertEquals("Error in addition()", 9, Calculator.add(9, 0));
    }

    @Test
    public void testAddFail() {
        assertThat("Test Fails",Calculator.add(1,2),is(not(1)));
    }

    @Test
    public void testSubPass(){
        assertEquals("Error in subtraction()",1,Calculator.sub(2,1));
        assertEquals("Error in subtraction()",-1,Calculator.sub(-2,-1));
        assertEquals("Error in subtraction()",0,Calculator.sub(2,2));
    }

    @Test
    public void testSubFail(){
        assertThat("Test Fails",Calculator.sub(2,1),is(not(6)));
    }
}
