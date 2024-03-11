import java.util.Scanner;

public class SafeInput {

    /**
     * Prompts the user for a non-zero length string input.
     *
     * @param pipe    a Scanner opened to read from System.in
     * @param prompt  prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine(); //read inpu
        } while (retString.length() == 0); //continue looping if not in range
        return retString;
    }

    /**
     * Prompts the user to input any integer.
     *
     * @param pipe   a Scanner object
     * @param prompt message to display as the prompt for the input
     * @return the integer input by the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        int number; //variable to hold integer input
        do {
            System.out.print("\n" + prompt + ": "); //display prompt for user
            while (!pipe.hasNextInt()) { //keep looping until integer is entered
                String input = pipe.next(); //read input as a string
                System.out.println("\"" + input + "\" is not a valid integer. Please try again."); //error message
                System.out.print(prompt + ": "); //display prompt again
            }
            number = pipe.nextInt();
        } while (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE); //keep looping if input is outside the range
        return number;
    }

    /**
     * Prompts the user to input any double value.
     *
     * @param pipe   a Scanner object
     * @param prompt message to display as the prompt for the input
     * @return the double value input by the user
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double number;
        do {
            System.out.print("\n" + prompt + ": "); //display prompt for user
            while (!pipe.hasNextDouble()) { //keep looping until double is entered
                String input = pipe.next(); //read input as string
                System.out.println("\"" + input + "\" is not a valid double. Please try again."); //error message
                System.out.print(prompt + ": "); //display prompt again
            }
            number = pipe.nextDouble(); //read double input
        } while (number < Double.MIN_VALUE || number > Double.MAX_VALUE); //continue loop
        return number; 
    }

    /**
     * Prompts the user to input an integer within a specified inclusive range.
     *
     * @param pipe   a Scanner object
     * @param prompt message to display as the prompt for the input
     * @param low    the low value for the input range
     * @param high   the high value for the input range
     * @return the integer input by the user within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int number;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: "); //display prompt for user
            while (!pipe.hasNextInt()) { //keep looping until integer is entered
                String input = pipe.next(); //read input as string
                System.out.println("\"" + input + "\" is not a valid integer. Please try again."); //error message
                System.out.print(prompt + " [" + low + " - " + high + "]: "); //display prompt again
            }
            number = pipe.nextInt(); //read integer input
        } while (number < low || number > high); //continue loop if not within range
        return number;
    }

    /**
     * Prompts the user to input a double value within a specified inclusive range.
     *
     * @param pipe   a Scanner object
     * @param prompt message to display as the prompt for the input
     * @param low    the low value for the input range
     * @param high   the high value for the input range
     * @return the double value input by the user within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double number;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: "); //display prompt for user
            while (!pipe.hasNextDouble()) { //keep looping until double is entered
                String input = pipe.next(); //read input as string
                System.out.println("\"" + input + "\" is not a valid double. Please try again."); //error message
                System.out.print(prompt + " [" + low + " - " + high + "]: "); //display prompt again
            }
            number = pipe.nextDouble(); //read double input
        } while (number < low || number > high); //continue loop if input isnt in range
        return number;
    }

    /**
     * Gets a Yes or No [Y/N] response from the user.
     *
     * @param pipe   a Scanner object
     * @param prompt message to display as the prompt for the input
     * @return true if the user enters 'Y' or 'y', false if 'N' or 'n'
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        char response;
        do {
            System.out.print("\n" + prompt + " [Y/N]: "); //display prompt for user
            response = Character.toUpperCase(pipe.next().charAt(0)); //read first char of user input and convert to uppercase
        } while (response != 'Y' && response != 'N'); //keep looping until user enters y or n
        return response == 'Y'; //returns true if user enters y, false otherwise
    }

    /**
     * Prompts the user to input a String that matches a RegEx pattern.
     *
     * @param pipe   a Scanner object
     * @param prompt message to display as the prompt for the input
     * @param regEx  the RegEx pattern to match
     * @return the string input by the user that matches the specified pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        do {
            System.out.print("\n" + prompt + ": "); //display prompt for user
            input = pipe.next();
        } while (!input.matches(regEx)); //continue looping
        return input;
    }

    /**
     * Creates a Pretty header with the message centered.
     *
     * @param msg the message to be centered in the header
     */
    public static void prettyHeader(String msg) {
        int totalWidth = 60; //define total width of the header
        int msgWidth = msg.length(); //calculate msg length
        int starsWidth = (totalWidth - msgWidth - 4) / 2; // 4 for the three stars on either side and the space
        StringBuilder header = new StringBuilder(); //to build the header

        // Top row of stars
        for (int i = 0; i < totalWidth; i++) { 
            header.append("*");
        }
        header.append("\n");

        // Centered message row
        header.append("***");
        for (int i = 0; i < starsWidth; i++) {
            header.append(" ");
        }
        header.append(msg);
        for (int i = 0; i < starsWidth; i++) {
            header.append(" ");
        }
        // If the width is odd, add an extra space at the end
        if ((totalWidth - msgWidth - 4) % 2 != 0) {
            header.append(" ");
        }
        header.append("***\n");

        // Bottom row of stars
        for (int i = 0; i < totalWidth; i++) {
            header.append("*");
        }

        System.out.println(header);
    }
}
