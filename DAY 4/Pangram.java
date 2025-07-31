import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a pangram:");
        String input = scanner.nextLine().toLowerCase();

        boolean[] alphabet = new boolean[26];
        int index;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                alphabet[index] = true;
            }
        }

        boolean isPangram = true;
        for (boolean b : alphabet) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("The input string is a pangram.");
        } else {
            System.out.println("The input string is not a pangram.");
        }

        scanner.close();
    }
}
