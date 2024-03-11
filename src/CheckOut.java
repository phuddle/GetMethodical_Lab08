import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0;
        boolean moreItems;
        do { //loop for user to input item prices
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item ($0.50 - $10.00)", 0.50, 10.00);
            totalCost += price; //adding price to total cost
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to add?"); 
        } while (moreItems); //loop until user has no more inputs
        System.out.printf("Total cost of the items: $%.2f%n", totalCost);
    }
}

