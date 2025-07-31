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
        int a,b;
        a=scanner.nextInt();
        b=scanner.nextInt();
        
        if(a == b){
            System.out.print("EQUAL");
        }
        else{
            System.out.print("NOT EQUAL");
        }
        scanner.close();
        
    }
}