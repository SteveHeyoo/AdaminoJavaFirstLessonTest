/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicToTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author gta1
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    //Write a test to check if the Calculator can do addition
    @Test
    public void testAdd() {
        int x = 5;
        int y = 5;
        Calculator instance = new Calculator();
        int expResult = 10;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }

    //Write a test to check if the Calculator can do substraction
    @Test
    public void testSubstract() {
        int x = 5;
        int y = 5;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.substract(x, y);
        assertEquals(expResult, result);
    }

    //Write a test to check if the Calculator can do division
    @Test
    public void testDivide() {
        int x = 5;
        int y = 5;
        Calculator instance = new Calculator();
        int expResult = 1;
        int result = instance.divide(x, y);
        assertEquals(expResult, result);
    }

    //Write a test to check if the Calculator can do multiplication
    @Test
    public void testMultiplicate() {
        int x = 5;
        int y = 5;
        Calculator instance = new Calculator();
        int expResult = 25;
        int result = instance.multiplicate(x, y);
        assertEquals(expResult, result);
    }

}
