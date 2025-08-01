import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase();
        scanner.close();

        char[] arr1 = str1.replaceAll("\\s+", "").toCharArray();
        char[] arr2 = str2.replaceAll("\\s+", "").toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given Strings are Anagram");
        } else {
            System.out.println("these Strings are Not Anagram");
        }
    }
}