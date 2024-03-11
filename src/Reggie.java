import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (e.g., 123-45-6789)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (e.g., M01234)", "^(M|m)\\d{5}$");
        System.out.println("Valid M Number: " + mNumber);

        String menuChoice = SafeInput.getRegExString(in, "Enter your menu choice (O - Open, S - Save, V - View, Q - Quit)", "^[OoSsVvQq]$");
        System.out.println("Valid Menu Choice: " + menuChoice.toUpperCase());
    }
}

