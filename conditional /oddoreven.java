import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n ;
        n = scanner.nextInt();
        
        if(n%2 != 1 ){
            System.out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }
            
        scanner.close();
    }
}