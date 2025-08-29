import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            if (a.equals(b)) {
                System.out.println("=");
                continue;
            }

            char tA = a.charAt(a.length() - 1); 
            char tB = b.charAt(b.length() - 1);

            if (tA != tB) {
                if (tA == 'S') {
                    System.out.println("<");
                } else if (tA == 'L') {
                    System.out.println(">");
                } else if (tA == 'M') {
                    if (tB == 'S') 
                        System.out.println(">");
                    else
                        System.out.println("<");
                }
                continue;
            }

            int xCountA = a.length() - 1;
            int xCountB = b.length() - 1;

            if (tA == 'S') { 
                if (xCountA > xCountB)
                    System.out.println("<");
                else
                    System.out.println(">");
            } else if (tA == 'L') { 
                if (xCountA > xCountB)
                    System.out.println(">");
                else 
                    System.out.println("<");
            }
        }
    }
}
