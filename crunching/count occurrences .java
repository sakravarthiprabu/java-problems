/*
Write a C program Count the number of occurrences of a digit in a given number

Input Format: The number and the digit

Constraints : NUMBER>0

Output Format : Integer

Sample Input : 12224 2
Sample Output : 3

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n,s, ld,count = 0;
        n = sc.nextInt();
        s = sc.nextInt();
        while(n>0){
            ld = n%10;
            if(ld == s){
                count++;
            }
             n = n/10;
        }
       
        System.out.println(count);   
        }
    }
