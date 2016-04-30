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

    public double sine(double value1) {
        return Math.sin(value1);
    }

    public double cosine(double value1) {
        return Math.cos(value1);
    }

    public double tangent(double value1) {
        return Math.tan(value1);
    }

    public double inverseSine(double value1) {
        return Math.asin(value1);
    }

    public double inverseCosine(double value1) {
        return Math.acos(value1);
    }

    public double inverseTangent(double value1) {
        return Math.atan(value1);
    }

    public double logarithm(double value1) {
        return Math.log10(value1);
    }

    public double naturalLogarithm(double value1) {
        return Math.log(value1);
    }

    public double factorial(double value1) {
        if(value1 == 1) {
            return 1;
        }
        return value1 * (factorial(value1-1));
    }

    public double inverseNaturalLog(double value1) {
        return Math.pow(Math.E, (Math.log(value1)));
    }

    public double inverseLogarithm(double value1) {
        return Math.pow(10, (Math.log(value1)));
    }























}
