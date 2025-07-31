import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputDate = sc.nextLine();  // e.g. 17/10/1994

        if (isValidDate(inputDate)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidDate(String dateStr) {
        // Check format: dd/mm/yyyy (note: mm not MM)
        if (!dateStr.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        String[] parts = dateStr.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Year must be in range
        if (year < 1900 || year > 9999)
            return false;

        // Month must be in range
        if (month < 1 || month > 12)
            return false;

        // Get number of days in the given month
        int[] daysInMonth = { 31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31 };

        // Check day range
        if (day < 1 || day > daysInMonth[month - 1])
            return false;

        return true;
    }

    public static boolean isLeapYear(int year) {
        // Leap year check
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
