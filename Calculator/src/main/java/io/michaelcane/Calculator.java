package io.michaelcane;


public class Calculator {

    Commands commands = new Commands();

    /**
     * Failed to go over methods that require their return to be degrees or radians.
     * Go back and add functionality.
     */
    public static double sum(double value1, double value2) {
        /**
         * This method should take two values (double)
         * and adds them together, returning the new value.
         */
        return value1 + value2;
    }

    public static double subtract(double value1, double value2) {
        /**
         * This method should take two values (double)
         * and subtracts the first from the second.
         */
        return value1 - value2;
    }

    public double divide(double value1, double value2) {
        /**
         * This method should take two values (double)
         * and divides the first by the second.
         */
        if(value2 == 0) {
            displayError();
        }
        return value1 / value2;
    }

    public static double multiply(double value1, double value2) {
        /**
         * This method should take two values (double)
         * and multiply the first with the second.
         */
        return value1 * value2;
    }

    public static double square(double value1) {
        /**
         * This method should square a value (double) provided by the user.
         */
        return value1 * value1;
    }

    public static double squareRoot(double value1) {
        /**
         * This method should provide the square root of a value (double).
         */
        return Math.sqrt(value1);
    }

    public static double variableExponentiation(double value1, double value2) {
        /**
         * This method should evaluate value1 (double) to the power of value2 (double).
         */
        return Math.pow(value1, value2);
    }

    public static double invertPositiveAndNegative(double value1) {
        /**
         * This method will invert the sign of the number
         */
        return value1 *= -1;
    }

    public static double sine(double value1) {
        /**
         * This method will evaluate to an answer that is equal to the ratio
         * of the side opposite a given angle (in a right triangle) to the hypotenuse.
         */
        return Math.sin(value1);
    }

    public static double cosine(double value1) {
        /**
         * This method will evaluate to an answer that is equal to the ratio
         * of the side adjacent to an acute angle (in a right-angled triangle) to the hypotenuse.
         */
        return Math.cos(value1);
    }

    public static double tangent(double value1) {
        /**
         * This method will evaluate a tangent line
         */
        return Math.tan(value1);
    }

    public static double inverseSine(double value1) {
        /**
         * This will provide the inverse of the sine of the value provided.
         */
        return Math.asin(value1);
    }

    public static double inverseCosine(double value1) {
        /**
         * This will provide the inverse of the cosine of the value provided.
         */
        return Math.acos(value1);
    }

    public static double inverseTangent(double value1) {
        /**
         * This will provide the inverse of the tangent of the value provided.
         */
        return Math.atan(value1);
    }

    public static double logarithm(double value1) {
        /**
         * This will evaluate to the base 10 value of the number provided.
         */
        return Math.log10(value1);
    }

    public static double naturalLogarithm(double value1) {
        /**
         * This will evaluate to the invers of the Log.
         */
        return Math.log(value1);
    }

    public static double factorial(double value1) {
        /**
         * This will give the factorial for the provided value.
         */
        if(value1 == 1) {
            return 1;
        }
        return value1 * (factorial(value1-1));
    }

    public static double inverseNaturalLog(double value1) {
        /**
         * This will give the inverse for natual logarithms
         */
        return Math.pow(Math.E, value1);
    }

    public static double inverseLogarithm(double value1) {
        /**
         * This will give the inverse for logarithms.
         */
        return Math.pow(10, value1);
    }

    private void displayError() {
        /**
         * Checks if dividing by Zero
         */
        System.out.println("ERROR - You broke the universe");
    }

    public void itsTimeForTheCalculator() {
        commands.giveCommand(Commands.Command.COSINE);
        commands.doTheThing();
    }



}






