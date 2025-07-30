import java.util.Scanner; // Required for reading console input

public class ExcelColumnConverter {

    public String convertToTitle(int columnNumber) {
        if (columnNumber <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            // Decrement to map 1-26 to 0-25
            columnNumber--;

            int remainder = columnNumber % 26;
            sb.append((char) ('A' + remainder));

            columnNumber = columnNumber / 26;
        }
        
        return sb.reverse().toString();
    }

    // The main method is now set up to handle user input
    public static void main(String[] args) {
        // 1. Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // 2. Prompt the user to enter a number
        System.out.print("Enter a column number : ");

        // 3. Read the integer provided by the user
        int number = scanner.nextInt();

        // 4. Create an instance of the class and call the conversion method
        ExcelColumnConverter converter = new ExcelColumnConverter();
        String title = converter.convertToTitle(number);

        // 5. Display the final result
        System.out.println("The corresponding Excel column title is: " + title);

        // 6. Close the scanner to prevent resource leaks
        scanner.close();
    }
}