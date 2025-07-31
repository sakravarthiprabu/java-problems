import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input in hh:mm:ss format
        String time = sc.nextLine();
        
        // Split by ':'
        String[] parts = time.split(":");
        
        // Check if input has exactly 3 parts
        if (parts.length != 3) {
            System.out.println("Not Valid");
            return;
        }
        
        // Try parsing and checking the time validity
        try {
            int hh = Integer.parseInt(parts[0]);
            int mm = Integer.parseInt(parts[1]);
            int ss = Integer.parseInt(parts[2]);

            // Check time constraints (24-hour format assumed unless specified)
            if (hh >= 0 && hh < 24 && mm >= 0 && mm < 60 && ss >= 0 && ss < 60) {
                System.out.println("Valid");
            } else {
                System.out.println("Not Valid");
            }
        } catch (NumberFormatException e) {
            // If parsing fails due to non-numeric input
            System.out.println("Not Valid");
        }
    }
}
