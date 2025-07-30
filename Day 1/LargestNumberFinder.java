import java.util.Scanner;

public class LargestNumberFinder {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three numbers, each followed by Enter:");
        
        // Read the three integers from the user
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        // Determine and print the largest number
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the largest number.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the largest number.");
        } else {
            System.out.println(n3 + " is the largest number.");
        }
        
        // Close the scanner to free up resources
        sc.close();
    }
}