import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int y;
        y = sc.nextInt();
        
        
         if( y % 4 == 0 && y %100 !=0|| y %400 == 0 ){
            System.out.print("Leap year");
        }
        else {
        
            System.out.print("Not a Leap year");
        }
        
        
    }
}