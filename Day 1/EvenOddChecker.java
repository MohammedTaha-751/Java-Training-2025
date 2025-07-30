import java.util.Scanner; // Imports the Scanner class

public class EvenOddChecker {

    public static void main(String[] args) {
        
        // Creates a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        // Reads the integer provided by the user
        int num = sc.nextInt();
        
        // Checks if the number is divisible by 2 with no remainder
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
        
        // Closes the scanner to prevent resource leaks
        sc.close();
    }
}