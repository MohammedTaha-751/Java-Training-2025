import java.util.Scanner;

public class LargestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split("\\s+");
        String largestWord = "";
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        System.out.println("Largest word: " + largestWord);
    }
}