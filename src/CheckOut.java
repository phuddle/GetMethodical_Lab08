import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0;
        boolean moreItems;
        do {
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item ($0.50 - $10.00)", 0.50, 10.00);
            totalCost += price;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items to add?");
        } while (moreItems);
        System.out.printf("Total cost of the items: $%.2f%n", totalCost);
    }
}

