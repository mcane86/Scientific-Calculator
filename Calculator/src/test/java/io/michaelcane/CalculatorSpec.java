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
         * This method should provide the square root of a value (double).
         */
        double expectedValue = 2;
        double actualValue = calculator.squareRoot(4);
        assertEquals("This should evaluate to 2", expectedValue, actualValue, delta);
    }

    @Test
    public void test$variableExponentiation() {
        /**
         * This method should evaluate value1 (double) to the power of value2 (double).
         */
        double expectedValue = 1000000;
        double actualValue = calculator.variableExponentiation(100, 3);
        assertEquals("This should evaluate to 1000", expectedValue, actualValue, delta);
    }

    @Test
    public void test$invertPositiveAndNegative() {
        /**
         * This method will invert the sign of the number
         */
        double expectedValue = 100;
        double actualValue = calculator.invertPositiveAndNegative(-100);
        assertEquals("This should evaluate to 100", expectedValue, actualValue, delta);
    }

    @Test
    public void test$sin() {
        /**
         * This method will evaluate to an answer that is equal to the ratio
         * of the side opposite a given angle (in a right triangle) to the hypotenuse.
         */
        double expectedValue = 0.8939966636005579;
        double actualVaue = calculator.sine(90);
        assertEquals("This should evaluate to 0.8939966636005579", expectedValue, actualVaue, delta);
    }

    @Test
    public void test$cosin() {
        /**
         * This method will evaluate to an answer that is equal to the ratio
         * of the side adjacent to an acute angle (in a right-angled triangle) to the hypotenuse.
         */
        double expectedValue = -0.4480736161291702;
        double actualValue = calculator.cosine(90);
        assertEquals("This should evaluate to 0.4480736161291702", expectedValue, actualValue, delta);
    }

    @Test
    public void test$tangent() {
        /**
         * This method will evaluate a tangent line
         */
        double expectedValue = -1.995200412208242;
        double actualValue = calculator.tangent(90);
        assertEquals("This should evaluate to -1.995200412208242", expectedValue, actualValue, delta);
    }

    @Test
    public void test$inverseSine() {
        /**
         * This will provide the inverse of the sine of the value provided.
         */
        double expectedValue = 0.14046141470985582;
        double actualValue = calculator.inverseSine(0.14);
        assertEquals("This should evaluate to .14046141470985582", expectedValue, actualValue, delta);

    }

    @Test
    public void test$inverseCosin() {
        /**
         * This will provide the inverse of the cosine of the value provided.
         */
        double expectedValue = 1.4303349120850408;
        double actualValue = calculator.inverseCosine(0.14);
        assertEquals("This should evaluate to 1.4303349120850408", expectedValue, actualValue, delta);
    }

    @Test
    public void test$inverseTangent() {
        /**
         * This will provide the inverse of the tangent of the value provided.
         */
        double expectedValue = 0.13909594148207133;
        double actualValue = calculator.inverseTangent(0.14);
        assertEquals("This should evaluate to 0.13909594148207133", expectedValue, actualValue, delta);
    }

    @Test
    public void test$logarithm() {
        /**
         * This will evaluate to the base 10 value of the number provided.
         */
        double expectedValue = 0.9542425094393249;
        double actualValue = calculator.logarithm(9);
        assertEquals("This should evaluate to 0.9542425094393249", expectedValue, actualValue, delta);
    }

    @Test
    public void test$naturalLogarithm() {
        /**
         * This will evaluate to the invers of the Log.
         */
        double expectedValue = 2.1972245773362196;
        double actualValue = calculator.naturalLogarithm(9);
        assertEquals("This should evaluate to 2.1972245773362196", expectedValue, actualValue, delta);
    }

    @Test
    public void test$factorial() {
        /**
         * This will give the factorial for the provided value.
         */
        double expectedValue = 24;
        double actualValue = calculator.factorial(4);
        assertEquals("This should evaluate to 24", expectedValue, actualValue, delta);
    }

    @Test
    public void test$inverseNaturalLog() {
        /**
         * This will give the inverse for natual logarithms
         */
        double expectedValue = 7.3890560989306495;
        double actualValue = calculator.inverseNaturalLog(2);
        assertEquals("This should evaluate to 7.3890560989306495", expectedValue, actualValue, delta);
    }

    @Test
    public void test$inverseLogarithm() {
        /**
         * This will give the inverse for logarithms.
         */
        double expectedValue = 1.0E9;
        double actualValue = calculator.inverseLogarithm(9);
        assertEquals("This should evaluate to 1000000000", expectedValue, actualValue, delta);
    }





























}
