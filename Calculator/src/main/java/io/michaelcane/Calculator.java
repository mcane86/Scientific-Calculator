package io.michaelcane;



public class Calculator {

    public double sum(double value1, double value2) {
        return value1 + value2;
    }

    public double subtract(double value1, double value2) {
        return value1 - value2;
    }

    public double divide(double value1, double value2) {
        return value1/value2;
    }

    public double multiply(double value1, double value2) {
        return value1 * value2;
    }

    public double square(double value1) {
        return value1 * value1;
    }

    public double squareRoot(double value1) {
        return Math.sqrt(value1);
    }

    public double variableExponentiation(double value1, double value2) {
        return Math.pow(value1, value2);
    }

    public double invertPositiveAndNegative(double value1) {
        return value1 *= -1;
    }

    public double sin(double value1) {
        return Math.sin(value1);
    }

    public double cosin(double value1) {
        return Math.cos(value1);
    }
}
