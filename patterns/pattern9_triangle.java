import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, row, col;
        n = sc.nextInt(); 
     
        for (row = 0; row < n; row++) {
            for (col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            int s = 2 * row + 1;
            for (col = 0; col < s; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
