/*
Write a c Program to find the product of the digits in a given number

Input Format: INTEGER

Constraints : INPUT>0

Output Format:  INTEGER

Sample Input : 123

Sample Output :6
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,ld,prod=1;
        n = sc.nextInt();
        while(n>0){
            ld = n%10;
            prod = prod*ld;
            n=n/10;
            
        }
        System.out.println(prod);
        
        
    }
}