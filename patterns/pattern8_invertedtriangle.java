import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, row, col;
        n = sc.nextInt();
        int stars;
        for (row = 0; row < n; row++) {
            for (col = 0; col < row; col++) {
                System.out.print(" ");
            }
            stars = 2 * (n - row) -1 ;
            for (col = 1; col <= stars; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
