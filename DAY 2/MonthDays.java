import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Month Days Calculator ===");
        System.out.print("Please enter the month number (1-12): ");

        int month = scanner.nextInt();
        int days;
        String monthName;

        switch (month) {
            case 1:
                monthName = "January";
                days = 31;
                break;
            case 2:
                monthName = "February";
                days = 28; // Not considering leap years for simplicity
                break;
            case 3:
                monthName = "March";
                days = 31;
                break;
            case 4:
                monthName = "April";
                days = 30;
                break;
            case 5:
                monthName = "May";
                days = 31;
                break;
            case 6:
                monthName = "June";
                days = 30;
                break;
            case 7:
                monthName = "July";
                days = 31;
                break;
            case 8:
                monthName = "August";
                days = 31;
                break;
            case 9:
                monthName = "September";
                days = 30;
                break;
            case 10:
                monthName = "October";
                days = 31;
                break;
            case 11:
                monthName = "November";
                days = 30;
                break;
            case 12:
                monthName = "December";
                days = 31;
                break;
            default:
                System.out.println("Oops! That's not a valid month number. Please enter a number between 1 and 12.");
                scanner.close();
                return;
        }

        System.out.println(monthName + " has " + days + " days.");
        System.out.println("Thank you for using the Month Days Calculator!");
        scanner.close();
    }
}
