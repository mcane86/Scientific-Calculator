package io.michaelcane;

public class Commands {

    Calculator calculator = new Calculator();
    Display display = new Display();
    User user = new User();

    Command command;

    public void giveCommand(Command command) {
        this.command = command;
    }

    public enum Command {
        /**
         * An enum that, if I can get it to work, should search for a command and activate it.
         * Each calculator function, as well each function that alters the Display and the Memory.
         */
        CLEARDISPLAY,
        CLEARERROR,
        CLEARMEMORY,
        COSINE,
        DIVIDE,
        FACTORIAL,
        INVERSECOSINE,
        INVERSELOGARITHM,
        INVERSENATURALLOG,
        INVERSESINE,
        INVERSETANGENT,
        INVERTPOSITIVEANDNEGATIVE,
        LOGARITHM,
        MULTIPLY,
        NATURALLOGARITHM,
        SETDISPLAYMODE,
        SETMEMORY,
        SINE,
        SQUARE,
        SQUAREROOT,
        SUBTRACT,
        SUM,
        RECALLMEMORY,
        TANGENT,
        VARIABLEEXPONENTIATION;
    }

    public void doTheThing() {
        switch (command) {
            /**
             * The switch statement for the above enum.
             */
            case COSINE:
                calculator.cosine(user.isNumber);
                System.out.println("It's working!");
                break;
            case DIVIDE:
                calculator.divide(display.getState(), user.isNumber);
                break;
            case FACTORIAL:
                calculator.factorial(user.isNumber);
                break;
            case INVERSECOSINE:
                calculator.inverseCosine(user.isNumber);
                break;
            case INVERSELOGARITHM:
                calculator.inverseLogarithm(user.isNumber);
                break;
            case INVERSENATURALLOG:
                calculator.inverseNaturalLog(user.isNumber);
                break;
            case INVERSESINE:
                calculator.inverseSine(user.isNumber);
                break;
            case INVERSETANGENT:
                calculator.inverseTangent(user.isNumber);
                break;
            case INVERTPOSITIVEANDNEGATIVE:
                calculator.invertPositiveAndNegative(user.isNumber);
                break;
            case LOGARITHM:
                calculator.logarithm(user.isNumber);
                break;
            case MULTIPLY:
                calculator.multiply(display.getState(), user.isNumber);
                break;
            case NATURALLOGARITHM:
                calculator.naturalLogarithm(user.isNumber);
                break;
            case SINE:
                calculator.sine(user.isNumber);
                break;
            case SQUARE:
                calculator.square(user.isNumber);
                break;
            case SQUAREROOT:
                calculator.squareRoot(user.isNumber);
                break;
            case SUM:
                calculator.sum(display.getState(), user.isNumber);
                break;
            case SUBTRACT:
                calculator.subtract(display.getState(), user.isNumber);
                break;
            case TANGENT:
                calculator.tangent(user.isNumber);
                break;
            case VARIABLEEXPONENTIATION:
                calculator.variableExponentiation(display.getState(), user.isNumber);
                break;
            case RECALLMEMORY:
                System.out.println(user.getMemory());
                display.setState(user.getMemory());
                break;
            case SETMEMORY:
                user.setMemory(user.isNumber);
                break;
            case CLEARMEMORY:
                user.clearMemory();
                break;
            case CLEARDISPLAY:
                display.clearDisplay();
                break;
            case CLEARERROR:
                display.clearError();
                break;
            case SETDISPLAYMODE:
                display.setDisplayMode(user.getInput());
            default:
                System.out.println("I did not recognize that command. \nPlease enter a command.");
                break;
        }
    }
}
