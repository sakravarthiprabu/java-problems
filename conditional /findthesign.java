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
        
        int n;
        n = sc.nextInt();
        
        if(n>0){
            System.out.print("Positive");
        }
        else if(n<0){
            System.out.print("Negative");
        }
        else{
            System.out.print("Zero");
        }
        
        
    }
}