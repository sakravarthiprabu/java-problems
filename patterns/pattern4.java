import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,row,col;
        n=sc.nextInt();
      
        for(row =1; row<=n; row++){
            for(int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }
            for(col =1; col<=n; col++){
                System.out.print("*");   
            }
            System.out.println();
            
        }
    }
}
