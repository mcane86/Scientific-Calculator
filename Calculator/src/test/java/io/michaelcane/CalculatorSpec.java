package io.michaelcane;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This is the TEST document for the Calculator.java class
 */


public class CalculatorSpec {

    Calculator calculator;

    @Before public void setUp() {
        calculator = new Calculator();
    }

    double delta = 1e-15;
    @Test
    public void test$sum() {
        /**
         * This method should take two values (double)
         * and adds them together, returning the new value.
         */
        double expectedValue = 5;
        double actualValue = calculator.sum(2, 3);
        assertEquals("This should evaluate to 5", expectedValue, actualValue, delta);
    }

    @Test
    public void test$subract() {
        /**
         * This method should take two values (double)
         * and subtracts the first from the second.
         */
        double expectedValue = 10;
        double actualValue = calculator.subtract(15, 5);
        assertEquals("This should evaluate to 10", expectedValue, actualValue, delta);
    }

    @Test
    public void test$divide() {
        /**
         * This method should take two values (double)
         * and divides the first from the second.
         */
        double expectedValue = 10;
        double actualValue = calculator.divide(20, 2);
        assertEquals("This should evaluate to 10", expectedValue, actualValue, delta);
    }

    @Test
    public void test$multiply() {
        /**
         * This method should take two values (double)
         * and multiply the first with the second.
         */
        double expectedValue = 100;
        double actualValue = calculator.multiply(50, 2);
        assertEquals("This should evaluate to 100", expectedValue, actualValue, delta);
    }

    @Test
    public void test$square() {
        /**
         * This method should square a value (double) provided by the user.
         */
        double expectedValue = 4;
        double actualValue = calculator.square(2);
        assertEquals("This should evaluate to 4", expectedValue, actualValue, delta);
    }

    @Test
    public void test$squareRoot() {
        /**
    }
}
