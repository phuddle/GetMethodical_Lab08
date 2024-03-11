import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //scanner
        int favoriteInt = SafeInput.getInt(in, "Enter your favorite integer"); //getting int
        double favoriteDouble = SafeInput.getDouble(in, "Enter your favorite double"); //getting dbl
        System.out.println("Your favorite integer: " + favoriteInt);
        System.out.println("Your favorite double: " + favoriteDouble);
    }
}

