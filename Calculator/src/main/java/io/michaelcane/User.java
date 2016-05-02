package io.michaelcane;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class User {

    Commands commands = new Commands();
    /**
     * This is the Memory that can be Set, Recalled, and Cleared.
     */
    double memory = 0;

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public void clearMemory() {
        this.memory = 0;
    }

    /**
     * The input taken from the user.
     */
    private String takeInput = "";

    Scanner sc = new Scanner(System.in);

    public void getValue() {
        takeInput = sc.nextLine();
    }
    public String getInput() {
        return takeInput;
    }

    double isNumber = 0;

    public void parser(String input) {
        /**
         * Parser that tells if user input is a String or a line that
         * could be parsed into a double.
         */
        try {
            isNumber = parseDouble(getInput());
        } catch (NumberFormatException e) {
            commands.doTheThing();
        }
    }
}
