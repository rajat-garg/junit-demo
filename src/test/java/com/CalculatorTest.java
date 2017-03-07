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

    @Test
    public void testDivIntPass(){
        assertEquals("Error in division()",3,Calculator.divInt(9,3));
        assertEquals("Error in division()",0,Calculator.divInt(1,6));
    }

    @Test
    public void testDivIntFail(){
        assertThat("Test Fails",Calculator.divInt(4,2),is(not(3)));
    }

    @Test
    public void testDivRealPass(){
        assertEquals("Error in Division()",0.333333,Calculator.divReal(1,3),1e-6);
        assertEquals("Error in division()",0.111111,Calculator.divReal(1,9),1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivIntByZero(){
        Calculator.divInt(9,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivRealByZero(){
        Calculator.divReal(4,0);
    }

    @Test
    public void testMulPass(){
        assertEquals("Error in Multiply()",6,Calculator.mul(2,3));
        assertEquals("Error in Multiply()",78,Calculator.mul(2,39));
    }

    @Test
    public void testMulFail(){
        assertThat("Error in Multiply()",Calculator.mul(6,11),is(not(696)));
    }
}
