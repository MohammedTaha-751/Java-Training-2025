import java.util.Scanner;
public class StringReverser{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse String is :" +reversed);
    }
}