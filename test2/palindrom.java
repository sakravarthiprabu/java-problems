/*
Find whether number is palindrome or not. The original number and the reverse of it are equal for a palindrome

Input Format: INT


Output Format: Palindrome / Not a Palindrome

Sample Input : 1234

Sample Output : Not a Palindrome

Explanation : 1234 != 4321 , so Not a Palindrome

Sample Input : 1331

Sample Output : Palindrome

Explanation :  1331 == 1331 ,
reverse , so Palindrome
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int originalNum = num; 
        int reversedNum = 0;  
        int digit;

        while (num != 0) {
            digit = num % 10;                
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;                   
        }
        if (originalNum == reversedNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
