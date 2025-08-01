import java.util.Scanner;

public class Palindrome{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.nextLine();
        scanner.close();

        String reversed = new StringBuilder(str).reverse().toString();

        if( str.equalsIgnoreCase(reversed)){
            System.out.println(str+ " is a Palindrome ");
        }else{
            System.out.println(str+ "is not a Palindrome ");
        }
    }
}