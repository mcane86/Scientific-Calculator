package io.michaelcane;

public class Display {

    /**
     * This is the current state of the Calculator.
     * Always begins at 0.00 (a doubl).
     */
    private double state = 0.00;

    public void setState(double state) {
        this.state = state;
    }

    public double getState() {
        return state;
    }

    public void clearDisplay() {
        this.state = 0.00;
    }

    public double showDisplay() {
        return state;
    }

    public double clearError() {
        return this.state = 0.00;
    }

    /**
     * An if/else-if/else statement meant to alter the display settings based upon
     * imput from the user.
      * @param mode
     */
    public void setDisplayMode(String mode) {
        if(mode == "binary") {
            System.out.println();
        } else if (mode == "hexidecimal") {
            System.out.println();
        } else if (mode == "octal") {
            System.out.println();
        } else if (mode == "decimal") {
            System.out.println();
        } else {
            System.out.println("I don't recognize this command.");
        }
    }


}