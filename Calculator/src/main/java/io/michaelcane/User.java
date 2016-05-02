package io.michaelcane;

import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class User {

    Commands commands = new Commands();

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
        try {
            isNumber = parseDouble(getInput());
        } catch (NumberFormatException e) {

        }
    }

}
