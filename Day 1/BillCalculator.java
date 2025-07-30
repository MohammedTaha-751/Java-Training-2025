import java.util.Scanner;

public class BillCalculator {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of units: ");
        int unit = sc.nextInt();
        
        System.out.print("Enter the cost per unit: ");
        int cost = sc.nextInt();
        
        double totalBill;
        
        // Calculate the bill based on the number of units
        if (unit < 100) {
            // Simple calculation if units are less than 100
            totalBill = unit * cost;
            System.out.println("The total bill is: " + totalBill);
        } else {
            // Calculates cost only for units exceeding 100
            totalBill = (unit - 100) * cost;
            System.out.println("The total bill for units above 100 is: " + totalBill);
        }
        
        // Close the scanner to free up resources
        sc.close();
    }
}