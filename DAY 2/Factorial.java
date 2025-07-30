import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("          Factorial Program           ");
        System.out.print("Enter a non-negative integer: ");

        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            System.out.print(number + "! = ");
            for (int i = number; i > 0; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
            BigInteger factorial = calculateFactorial(number);
            System.out.printf("Factorial of %d is: %s%n", number, factorial.toString());
        }

        System.out.println("Thank you for using the Factorial Program!");
        scanner.close();
    }

    private static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
